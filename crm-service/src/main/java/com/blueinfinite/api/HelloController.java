package com.blueinfinite.api;


import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    private final Logger logger=Logger.getLogger(getClass());

    @RequestMapping("/index")
    public String index() {
        return "Hello cloud."+System.currentTimeMillis();
    }
}
