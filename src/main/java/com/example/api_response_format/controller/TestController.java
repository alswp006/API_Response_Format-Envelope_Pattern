package com.example.api_response_format.controller;

import com.example.api_response_format.common.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/success")
    public ApiResponse<String> success() {
        return ApiResponse.success("성공!!");
    }

    @GetMapping("/api/fail")
    public ApiResponse<String> fail() {
        throw new IllegalArgumentException("잘못된 요청입니다.");
    }

    @GetMapping("/api/error")
    public ApiResponse<String> error() {
        throw new RuntimeException("알 수 없는 에러가 발생하였습니다.");
    }
}