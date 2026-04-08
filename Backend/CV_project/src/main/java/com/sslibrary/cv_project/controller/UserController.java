package com.sslibrary.cv_project.controller;

import com.sslibrary.cv_project.entity.ApiResponse;
import com.sslibrary.cv_project.entity.ReqVoByUserMsg;
import com.sslibrary.cv_project.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Data
@Builder
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "contactMeInfo")
    public ApiResponse addContactMeInfo(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "inquiry") String inquiry,
            HttpSession session
    ){
        ReqVoByUserMsg reqVoByUserMsg = ReqVoByUserMsg.builder()
                .name(name)
                .email(email)
                .inquiry(inquiry)
                .build();

        String response = userService.addContactMe(reqVoByUserMsg, session);

        return ApiResponse.data("0000", "SUCCESS", response);
        // temp end
    }
}
