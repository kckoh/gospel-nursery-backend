package com.example.backend.service;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.example.backend.dto.ImageUrl;
import com.example.backend.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class ImageService {

    private final ImageRepository imageRepository;

    public Set<String> getImages() {
        return imageRepository.getImages();
    }
}
