package com.example.backend.repository;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Repository
public class ImageRepositoryS3Impl implements ImageRepository {

    private final AmazonS3 amazonS3;
    private final String bucketName = "gospel";
    Set<String> images = new HashSet<>();

    private final String baseUrl = "https://gospel.s3.amazonaws.com/";

    @Override
    public Set<String> getImages() {

        ListObjectsV2Result result = amazonS3.listObjectsV2(bucketName);
        List<S3ObjectSummary> objects = result.getObjectSummaries();

        for (S3ObjectSummary os : objects) {
            images.add(baseUrl + os.getKey());
        }

        return images;
    }
}
