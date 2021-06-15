package com.redhat.demo.servicemeshleaf2.controller;

import com.redhat.demo.servicemeshleaf2.restclient.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class LeafController {

    private static AtomicLong callCount = new AtomicLong(0);

    @Autowired
    private ClientService clientService;

    @GetMapping("/leaf2")
    public String leaf2() {
        return new StringBuilder("leaf2")
                .append(", call Count: " + callCount.incrementAndGet())
                .toString();
    }

    @GetMapping("callleaf1")
    public String callLeaf1() {
        String response = clientService.callLeaf1();
        StringBuilder finalResponse = new StringBuilder(response).append("\n")
                .append("call count: " + callCount.incrementAndGet());
        return response;
    }
}
