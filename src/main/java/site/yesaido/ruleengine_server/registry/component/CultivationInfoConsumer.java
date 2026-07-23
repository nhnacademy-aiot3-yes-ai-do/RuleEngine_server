package site.yesaido.ruleengine_server.registry.component;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import site.yesaido.ruleengine_server.registry.dto.cultivation.CultivationInfoCreateDto;
import site.yesaido.ruleengine_server.registry.dto.cultivation.CultivationInfoDeleteDto;
import site.yesaido.ruleengine_server.registry.dto.cultivation.CultivationInfoUpdateDto;
import site.yesaido.ruleengine_server.registry.service.CultivationInfoService;

@RequiredArgsConstructor
@RabbitListener(queues = "${rabbitmq.queue.cultivation-info}", errorHandler = "validationErrorHandler")
@Component
public class CultivationInfoConsumer {

    private final CultivationInfoService cultivationInfoService;

    @RabbitHandler
    public void consumeCultivationInfoCreate(@Payload @Valid CultivationInfoCreateDto cultivationInfoCreateDto) {

        cultivationInfoService.createCultivationInfo(cultivationInfoCreateDto);
    }

    @RabbitHandler
    public void consumeCultivationInfoUpdate(@Payload @Valid CultivationInfoUpdateDto cultivationInfoUpdateDto) {

        cultivationInfoService.updateCultivationInfo(cultivationInfoUpdateDto);
    }

    @RabbitHandler
    public void consumeCultivationInfoDelete(@Payload @Valid CultivationInfoDeleteDto cultivationInfoDeleteDto) {

        cultivationInfoService.deleteCultivationInfo(cultivationInfoDeleteDto);
    }
}
