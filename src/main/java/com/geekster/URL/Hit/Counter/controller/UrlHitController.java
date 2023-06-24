package com.geekster.URL.Hit.Counter.controller;

import com.geekster.URL.Hit.Counter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {

    private final UrlHitService urlHitService;

    @Autowired
    public UrlHitController(UrlHitService urlHitService) {
        this.urlHitService = urlHitService;
    }

    @GetMapping("count")
    public Map<String, Integer> getHitCount() {
        int hitCount = urlHitService.getHitCount();

        Map<String, Integer> output = new HashMap<>();
        output.put("visitor", hitCount);
        return output;
    }

    @GetMapping("username/{username}/count")
    public Map<String, Object> getHitCountByUsername(@PathVariable String username) {
        int hitCount = urlHitService.getHitCountByUsername(username);

        Map<String, Object> output = new HashMap<>();
        output.put("username", username);
        output.put("hitcount", hitCount);
        return output;
    }
}
