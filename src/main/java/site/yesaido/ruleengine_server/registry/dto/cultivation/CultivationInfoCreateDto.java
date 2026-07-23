package site.yesaido.ruleengine_server.registry.dto.cultivation;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 재배 환경 생성을 위한 DTO입니다.
 */
@Getter
@Setter
@NoArgsConstructor
public class CultivationInfoCreateDto {

    @NotNull
    private Long cultivationId;

    // cultivation 이름 추가 고려
    // @NotBlank
    // private String cultivationName;

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



/*
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
*/