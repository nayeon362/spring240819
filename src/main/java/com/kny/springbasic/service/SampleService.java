package com.kny.springbasic.Service;

import org.springframework.http.ResponseEntity;

import com.kny.springbasic.dto.PostSample1RequestDto;

public interface SampleService {
    
    ResponseEntity<String> postSample1 (PostSample1RequestDto dto);
}
