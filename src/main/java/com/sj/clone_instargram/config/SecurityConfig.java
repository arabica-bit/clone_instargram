package com.sj.clone_instargram.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@RequiredArgsConstructor
@EnableWebSecurity
@Configuration
//todo deprecated된 추상클래스 대체하기
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable(); //다른 모듈과 연동할 때는 켜야함.
        http.authorizeRequests()
                .antMatchers("/login","/signup","/style/**","/js/**","/img/**").permitAll()
                .anyRequest().authenticated()
            .and()
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/loginForm")
                .defaultSuccessUrl("/")
            .and()
                .logout()
                .logoutSuccessUrl("/login")
                .invalidateHttpSession(true) //세션 전체 삭제
            ;
        //나중에 oauth 로그인도 같이 설정할 수 있음.
    }

}
