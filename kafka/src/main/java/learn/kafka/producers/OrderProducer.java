package learn.kafka.producers;


import learn.kafka.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class OrderProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void produceOrder(String order){
        kafkaTemplate.send(
                "order-service",
                order.toString()
        );
    }
}
