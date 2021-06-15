package com.redhat.demo.servicemeshleaf2.controller;

import com.redhat.demo.servicemeshleaf2.restclient.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeafController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/leaf2")
    public String leaf2() {
        return "leaf2";
    }

    @GetMapping("callleaf1")
    public String callLeaf1() {
        String response = clientService.callLeaf1();
        return response;
    }
}
