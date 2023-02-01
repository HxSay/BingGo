package com.ts.domain;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class TestBean {
    private String dat;
    private String stream;
    private byte[] streamb;
}
