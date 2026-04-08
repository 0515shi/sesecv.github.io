package com.sslibrary.cv_project.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {

    private String code;
    private String message;
    private T data;

    public static <T> ApiResponse<T> data(String code, String message){
        ApiResponse<T> apiResponse = new ApiResponse<>();
        apiResponse.setCode(code);
        apiResponse.setMessage(message);

        return apiResponse;
    }

    public static <T> ApiResponse<T> data(String code, String message, T data){
        ApiResponse<T> apiResponse = new ApiResponse<>();
        apiResponse.setCode(code);
        apiResponse.setMessage(message);
        apiResponse.setData(data);
        return apiResponse;
    }
}
