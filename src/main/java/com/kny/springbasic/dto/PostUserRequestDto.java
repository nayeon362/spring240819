package com.kny.springbasic.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostUserRequestDto {
    
    
    private String userId;
    private String password;
    private String name;
    private String address;
    private String telNumber;
}
