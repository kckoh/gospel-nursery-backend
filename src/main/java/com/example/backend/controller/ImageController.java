package com.example.backend.controller;

import com.example.backend.service.ImageService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import java.util.Set;

import static org.springframework.http.HttpStatus.OK;

@Tag(name = "Image", description = "swagger Image api")
@CrossOrigin(origins = "https://gospelnursery.net")
@RequestMapping(value = "/v1")
@RequiredArgsConstructor
@RestController
public class ImageController {

    private final ImageService imageService;

    final String url = "";

    @Operation(summary = "Hello", description = "Hello 조회 메서드입니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "조회 성공"),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error.class)))
    })
    @CrossOrigin(origins = url)
    @GetMapping
    public String hello(){
        return "new CI/CD successful!!!";
    }


    @ResponseStatus(OK)
    @GetMapping("/images")
    public Set<String> getImages() {
        return imageService.getImages();
    }
}
