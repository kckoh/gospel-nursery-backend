package com.example.backend.dto;

import lombok.Builder;
import lombok.Getter;


@Getter
public class ImageUrl {
    private String url;

    public ImageUrl(String url) {
        this.url = url;
    }
}
