package com.example.wellibee.controller;

import com.example.wellibee.component.AwsS3;
import com.example.wellibee.service.AwsS3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/s3")
@RequiredArgsConstructor
public class AwsS3Controller {
    private final AwsS3Service awsS3Service;

    @PostMapping("/resource")
    public AwsS3 upload(@RequestPart("image") MultipartFile multipartFile) throws IOException {
        return awsS3Service.upload(multipartFile,"face-detect");
    }

    @DeleteMapping("/resource")
    public void remove(AwsS3 awsS3) {
        awsS3Service.remove(awsS3);
    }
}
