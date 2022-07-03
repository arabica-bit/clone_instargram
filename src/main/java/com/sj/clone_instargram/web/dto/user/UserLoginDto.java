package com.sj.clone_instargram.web.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserLoginDto {
    private String email;
    private String password;
    private String phone;
    private String name;
}
