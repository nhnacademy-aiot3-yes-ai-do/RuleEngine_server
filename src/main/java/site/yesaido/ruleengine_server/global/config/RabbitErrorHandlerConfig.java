package site.yesaido.ruleengine_server.global.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.listener.api.RabbitListenerErrorHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class RabbitErrorHandlerConfig {

    @Bean
    public RabbitListenerErrorHandler validationErrorHandler() {
        return (amqpMessage, channel, message, exception) -> {
            log.warn("[RabbitMQ Validation] 수신 메세지 검증 에러 : {}", message, exception);
            return null;
        };
    }
}
