package site.yesaido.ruleengine_server.registry.dto.cultivation;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 재배 환경 삭제를 위한 DTO입니다.
 */
@Getter
@Setter
@NoArgsConstructor
public class CultivationInfoDeleteDto {

    @NotNull
    private Long cultivationId;
}
