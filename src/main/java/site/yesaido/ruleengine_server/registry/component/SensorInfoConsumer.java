package site.yesaido.ruleengine_server.registry.component;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import site.yesaido.ruleengine_server.registry.dto.sensor.SensorInfoCreateDto;
import site.yesaido.ruleengine_server.registry.dto.sensor.SensorInfoDeleteDto;
import site.yesaido.ruleengine_server.registry.dto.sensor.SensorInfoUpdateDto;
import site.yesaido.ruleengine_server.registry.service.SensorInfoService;

@RequiredArgsConstructor
@RabbitListener(queues = "${rabbitmq.queue.sensor-info}", errorHandler = "validationErrorHandler")
@Component
public class SensorInfoConsumer {

    private final SensorInfoService sensorInfoService;

    @RabbitHandler
    public void consumeSensorInfoCreate(@Payload @Valid SensorInfoCreateDto sensorInfoCreateDto) {

        sensorInfoService.createSensorInfo(sensorInfoCreateDto);
    }

    @RabbitHandler
    public void consumeSensorInfoUpdate(@Payload @Valid SensorInfoUpdateDto sensorInfoUpdateDto) {

        sensorInfoService.updateSensorInfo(sensorInfoUpdateDto);
    }

    @RabbitHandler
    public void consumeSensorInfoDelete(@Payload @Valid SensorInfoDeleteDto sensorInfoDeleteDto) {

        sensorInfoService.deleteSensorInfo(sensorInfoDeleteDto);
    }
}
