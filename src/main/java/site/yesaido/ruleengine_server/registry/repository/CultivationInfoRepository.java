package site.yesaido.ruleengine_server.registry.repository;

import site.yesaido.ruleengine_server.registry.dto.cultivation.CultivationInfoDto;

/**
 * 재배 환경 정보의 CRUD를 담당하는 Repository 인터페이스입니다.<br>
 * Redis 외 다른 Repository를 고려하여 인터페이스로 정의합니다.
 */
public interface CultivationInfoRepository {

    /**
     * [Create & Update] 재배 환경 정보를 삽입 또는 갱신합니다.
     * @param dto 삽입 또는 갱신할 재배 환경에 대한 정보를 담은 dto
     */
    void upsertCultivationInfo(CultivationInfoDto dto);

    // Read
    /*
        추후 조회 기능 필요 시, 그 시점에 메서드 작성
        void findCultivationInfo();
    */

    /**
     * [Delete] 재배 환경 정보를 삭제합니다.
     * @param cultivationId 삭제할 재배 환경의 id
     */
    void deleteCultivationInfo(Long cultivationId);

    // ==================================================

    /**
     * 재배 환경 정보에 대한 존재 여부를 반환합니다.
     * @param cultivationId 존재 여부를 확인할 재배 환경의 id
     * @return {@code true} 재배 환경 정보가 존재할 경우
     */
    boolean exists(Long cultivationId);
}
