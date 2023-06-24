package com.geekster.URL.Hit.Counter.service;

import com.geekster.URL.Hit.Counter.entity.UrlHit;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlHitService {
    private final Map<String, UrlHit> urlHitMap;

    public UrlHitService() {
        this.urlHitMap = new HashMap<>();
    }

    public int getHitCount() {
        UrlHit urlHit = urlHitMap.getOrDefault("default", new UrlHit());
        urlHit.setHitCount(urlHit.getHitCount() + 1);
        urlHitMap.put("default", urlHit);
        return urlHit.getHitCount();
    }

    public int getHitCountByUsername(String username) {
        UrlHit urlHit = urlHitMap.getOrDefault(username, new UrlHit());
        urlHit.setHitCount(urlHit.getHitCount() + 1);
        urlHitMap.put(username, urlHit);
        return urlHit.getHitCount();
    }
}
