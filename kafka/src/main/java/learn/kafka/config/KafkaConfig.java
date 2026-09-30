package learn.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class KafkaConfig {

    Logger logger = LoggerFactory.getLogger(KafkaConfig.class);

    @Bean
    public NewTopic orderTopic() {
        return new NewTopic("order-service", 2, (short) 1);
    }

    @Bean
    public NewTopic inventoryTopic() {
        return new NewTopic("inventory-service", 2, (short) 1);
    }
    @Bean
    public NewTopic notificationTopic() {
        return new NewTopic("notification-service", 2, (short) 1);
    }

    @Bean
    public NewTopic paymentTopic() {
        return new NewTopic("payment-service", 2, (short) 1);
    }
}
