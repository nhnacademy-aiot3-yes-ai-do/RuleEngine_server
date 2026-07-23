package site.yesaido.ruleengine_server.registry.dto.cultivation;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.yesaido.ruleengine_server.registry.dto.SensorType;

/**
 * 재배 환경 수정을 위한 DTO입니다.
 */
@Getter
@Setter
@NoArgsConstructor
public class CultivationInfoUpdateDto {

    @NotNull
    private Long cultivationId;

    // 온도 최솟값, 최댓값
    @NotNull
    private Double tempMin;
    @NotNull
    private Double tempMax;

    // 습도
    @NotNull
    private Double humidityMin;
    @NotNull
    private Double humidityMax;

    // CO2
    @NotNull
    private Double co2Min;
    @NotNull
    private Double co2Max;

    // 조도
    @NotNull
    private Double lightMin;
    @NotNull
    private Double lightMax;

}

// 수정할 때도 4개의 센서 타입 임계값을 전부 다시 보내는 식이라면 위 방식을 채택
// 특성 센서 타입 하나만 골라서 그 값만 변경하는 방식이라면 아래를 채택
/*
@Getter
@Setter
@NoArgsConstructor
public class CultivationInfoUpdateDto {

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
}
*/
