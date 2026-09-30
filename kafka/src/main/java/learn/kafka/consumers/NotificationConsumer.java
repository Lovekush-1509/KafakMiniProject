package learn.kafka.consumers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    Logger logger = LoggerFactory.getLogger(NotificationConsumer.class);

    @KafkaListener(topics="payment-service",groupId="sending-notif")
    public void listen(String message){
        logger.info("received message:" + message);
        logger.info("sending message:" + message);
    }
}
