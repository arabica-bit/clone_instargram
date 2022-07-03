package com.sj.clone_instargram.web.controller;

import com.sj.clone_instargram.service.UserService;
import com.sj.clone_instargram.web.dto.user.UserLoginDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class AccountController {
    private final UserService userService;

    //회원가입
    @PostMapping("/signup")
    public String signup(UserLoginDto userLoginDto){
        if(userService.save(userLoginDto)){
            return "redirect:/login";
        }else {
            return "redirect:/signup?error";
        }
    }
}
