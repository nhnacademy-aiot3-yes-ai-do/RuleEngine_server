package site.yesaido.ruleengine_server.registry.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 센서 및 임계값 정보를 위한 DTO입니다.
 */
@Getter
@Setter
@NoArgsConstructor
public class SensorInfoDto {

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
