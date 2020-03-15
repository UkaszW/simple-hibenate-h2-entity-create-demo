package com.example.hibenateh2entitycreate.api;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = ApiUrls.API_V1)
public class BasicEndpoint {

    private static final String HELLO_WORLD = "Hello user, app version: ";

    @GetMapping("/hello")
    public String hello() {
        return HELLO_WORLD + Instant.now();
    }
}
