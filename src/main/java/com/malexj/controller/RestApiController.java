package com.malexj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/v1")
public class RestApiController {

    @Value("${config.info}")
    private String info;

    @GetMapping("/info")
    public ResponseEntity<String> info() {
        return ResponseEntity.ok(info);
    }
}
