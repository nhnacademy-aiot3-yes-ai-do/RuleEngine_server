package site.yesaido.ruleengine_server.registry.repository.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import site.yesaido.ruleengine_server.registry.repository.RegistryRepository;

/**
 * RegistryRepository의 Redis 기반 구현체입니다.<br>
 * Collector validation 및 RuleEngine 판단 시 필요한 재배 환경/센서 정보를 Redis에 저장 및 조회합니다.
 */
@RequiredArgsConstructor
@Repository
public class RedisRegistryRepository implements RegistryRepository {

    // ...

}
