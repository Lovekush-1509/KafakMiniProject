package learn.kafka.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class testController {
    Logger logger = LoggerFactory.getLogger(testController.class);

    @GetMapping
    public String test(){
        logger.info("test");
        return "test";
    }
}
