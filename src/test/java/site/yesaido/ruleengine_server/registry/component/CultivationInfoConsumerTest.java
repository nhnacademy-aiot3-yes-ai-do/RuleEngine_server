package site.yesaido.ruleengine_server.registry.component;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import site.yesaido.ruleengine_server.registry.dto.cultivation.CultivationInfoDeleteDto;
import site.yesaido.ruleengine_server.registry.dto.cultivation.CultivationInfoDto;
import site.yesaido.ruleengine_server.registry.service.CultivationInfoService;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class CultivationInfoConsumerTest {

    @Mock
    private CultivationInfoService cultivationInfoService;

    @InjectMocks
    private CultivationInfoConsumer cultivationInfoConsumer;

    @Test
    void test_consumeCultivationInfoUpsert() {
        CultivationInfoDto dto = new CultivationInfoDto(
                1L,
                20.0, 30.0,
                60.0, 80.0,
                600.0, 800.0,
                0.0, 500.0
        );

        cultivationInfoConsumer.consumeCultivationInfoUpsert(dto);

        verify(cultivationInfoService, times(1))
                .upsertCultivationInfo(any(CultivationInfoDto.class));
    }

    @Test
    void test_consumeCultivationInfoDelete() {
        CultivationInfoDeleteDto deleteDto = new CultivationInfoDeleteDto();
        deleteDto.setCultivationId(1L);

        cultivationInfoConsumer.consumeCultivationInfoDelete(deleteDto);

        verify(cultivationInfoService, times(1))
                .deleteCultivationInfo(any(CultivationInfoDeleteDto.class));
    }

}
