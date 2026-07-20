package site.yesaido.ruleengine_server.registry.component;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class SensorInfoConsumer {

    // ...

    @RabbitListener(queues = "${rabbitmq.queue.sensor-info}")
    public void consumeSensorInfo() {

    }

}
