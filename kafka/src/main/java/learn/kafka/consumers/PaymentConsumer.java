package learn.kafka.consumers;

import learn.kafka.dto.OrderDTO;
import learn.kafka.producers.PaymentProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PaymentConsumer {

    Logger logger = LoggerFactory.getLogger(PaymentConsumer.class);

    @Autowired
    PaymentProducer paymentProducer;

    @KafkaListener(topics="order-service",groupId="process-payment")
    public void listen(@Payload String order) {
        logger.info("Received Order Details: " + order);
        logger.info("payment completed for order:" + order);
        logger.info("confirming order and sending notification to user");
        paymentProducer.PaymentPublisher(order);

    }
}
