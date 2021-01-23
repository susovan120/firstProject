package org.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(@PathParam("a") String a) {
        return "Greetings from " + a;
    }

}
