package com.example.api_response_format.common.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ApiResponse<T> {
    private boolean success;
    private T data;
    private ErrorResponse error;

    public static <T> ApiResponse<T> success(T data) {
        ApiResponse<T> response = new ApiResponse<>();
        response.success = true;
        response.data = data;
        return response;
    }

    public static <T> ApiResponse<T> error(ErrorResponse errorResponse) {
        ApiResponse<T> response = new ApiResponse<>();
        response.success = false;
        response.error = errorResponse;
        return response;
    }
}