package learn.kafka.consumers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class InventoryConsumer {

    Logger logger = LoggerFactory.getLogger(InventoryConsumer.class);

    public int generateRandomNumber() {
        return ThreadLocalRandom.current().nextInt(1, 101);
    }

    @KafkaListener(topics="order-service",groupId="process-inventory")
    public void processOrder(String order) {
        logger.info("Received by inventory for processing inventory order: " + order);
        if(generateRandomNumber()%2 == 0){
            logger.info("there is not stock available for this order : " + order);
            logger.info("sending notification to warehouse keeper:");
        }else {
            logger.info("stock available for this order : " + order);
        }
    }
}
