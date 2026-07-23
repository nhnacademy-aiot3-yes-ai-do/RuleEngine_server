package site.yesaido.ruleengine_server.registry.dto.sensor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.yesaido.ruleengine_server.registry.dto.SensorType;

/**
 * 센서 정보 생성을 위한 DTO입니다.
 */
@Getter
@Setter
@NoArgsConstructor
public class SensorInfoCreateDto {

    @NotNull
    private Long cultivationId;

    @NotBlank
    private String place;

    @NotBlank
    private String location;

    @NotBlank
    private String deviceModel;

    @NotBlank
    private String deviceEui;

    @NotNull
    private SensorType sensorType;
}