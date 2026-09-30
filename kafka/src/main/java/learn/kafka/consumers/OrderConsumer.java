package learn.kafka.consumers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    Logger logger = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics="payment-service",groupId="confirming-order")
    public void confirmOrder(String order){
        logger.info("confirming order:" + order);
        logger.info("order confirmed" + order);
    }
}
