package com.kny.springbasic.service.implement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kny.springbasic.service.SampleService;
import com.kny.springbasic.dto.PostSample1RequestDto;

@Service

public class SampleServiceImplement implements SampleService {

    @Override
    public ResponseEntity<String> postSample1(PostSample1RequestDto dto) {

        return ResponseEntity.status(HttpStatus.CREATED).body("성공");
    }

}
