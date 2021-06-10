package com.chris.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/getServerUser")
    public Object getServerUser() {
        return restTemplate.getForEntity("http://127.0.0.1:80/getUser", Object.class);
    }
}
