package site.yesaido.ruleengine_server.registry.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 재배 환경을 위한 DTO입니다.
 */
@Getter
@Setter
@NoArgsConstructor
public class CultivationInfoDto {

    @NotNull
    private Long cultivationId;

    // 센서 타입
    @NotNull
    private SensorType sensorType;

    // 최솟값
    @NotNull
    private Double minValue;

    // 최댓값
    @NotNull
    private Double maxValue;

    // 단위
    @NotBlank
    private String unit;
}