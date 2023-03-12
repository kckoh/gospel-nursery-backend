package com.example.backend.controller;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.example.backend.dto.ImageUrl;
import com.example.backend.service.ImageService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Set;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@RestController
public class ImageController {

    private final ImageService imageService;

    final String url = "";

    @CrossOrigin(origins = url)
    @GetMapping
    public String hello(){
        return "new CI/CD successful!!!";
    }

    @GetMapping("/images")
    public Set<String> getImages() {
        return imageService.getImages();
    }
}
