package com.kny.springbasic.service;

import com.kny.springbasic.dto.PostUserRequestDto;
import com.kny.springbasic.dto.SignInRequestDto;

public interface AuthService {
    String signUp(PostUserRequestDto dto);
    String signIn(SignInRequestDto dto);
}