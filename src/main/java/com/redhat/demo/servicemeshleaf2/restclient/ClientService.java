package com.redhat.demo.servicemeshleaf2.restclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientService {

    @Value("${leaf1.hostname}")
    private String hostname;

    @Value("${leaf1.port}")
    private String port;

    private String path = "/leaf1";

    @Autowired
    private RestTemplate restTemplate;


    public String callLeaf1() {
        String url = "http://" + hostname + ":" + port + path;
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return "leaf2 -> " + response.getBody();
    }
}
