package site.yesaido.ruleengine_server.registry.repository.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import site.yesaido.ruleengine_server.registry.dto.SensorType;
import site.yesaido.ruleengine_server.registry.dto.sensor.SensorInfoDto;
import site.yesaido.ruleengine_server.registry.repository.SensorInfoRepository;

/**
 * SensorInfoRepository의 Redis 기반 구현체입니다.<br>
 * Collector validation 및 RuleEngine 판단 시 필요한 센서 정보를 Redis에 저장 및 조회합니다.
 */
@RequiredArgsConstructor
@Repository
public class SensorInfoRedisRepository implements SensorInfoRepository {

    private static final String KEY_TEMPLATE = "sensor:%d:%s";
    private final RedisTemplate<String, Object> redisTemplate;

    @Override
    public void upsertSensorInfo(SensorInfoDto dto) {
        redisTemplate.opsForValue().set(
                buildKey(dto.getCultivationId(), dto.getSensorType()),
                dto
        );
    }

    @Override
    public void deleteSensorInfo(Long cultivationId, SensorType sensorType) {
        redisTemplate.delete(
                buildKey(cultivationId, sensorType)
        );
    }

    @Override
    public boolean exists(Long cultivationId, SensorType sensorType) {
        return Boolean.TRUE.equals(
                redisTemplate.hasKey(buildKey(cultivationId, sensorType))
        );
    }

    // ==================================================

    private String buildKey(Long cultivationId, SensorType sensorType) {
        return KEY_TEMPLATE.formatted(cultivationId, sensorType.name());
    }
}
