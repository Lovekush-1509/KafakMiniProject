package learn.kafka.controllers;

import learn.kafka.dto.OrderDTO;
import learn.kafka.producers.OrderProducer;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    OrderProducer orderProducer;

    @PostMapping("/create")
    public String createOrder(@RequestBody String order) {
        logger.info("createOrder and publishing to other services:{}",order);
        orderProducer.produceOrder(order);
        return "success";
    }
}
