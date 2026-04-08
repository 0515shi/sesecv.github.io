package com.sslibrary.cv_project.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReqVoByUserMsg {
    String name;
    String email;
    String inquiry;
}
