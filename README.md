# RuleEngine Server

버섯 재배 환경에 대한 센서 데이터를 수집·정제하고, 수집된 데이터를 룰 엔진으로 판단하여 필요한 조치를 취하는 RuleEngine Server 입니다.

## 프로젝트 개요

**Collector Service**와 **RuleEngine** 두 부분으로 구성됩니다.

### Collector Service
- MQTT를 통해 센서(온도, 습도, CO2 등)로부터 발행되는 데이터를 구독합니다.
- 수신한 데이터를 파싱·정제하여 처리 가능한 형태로 변환합니다.
- 정제된 데이터를 RuleEngine으로 전달합니다.

### RuleEngine
- 전달받은 센서 데이터를 각 재배 환경에 설정된 임계값과 비교합니다.
- 값이 '정상 범위'인지 '이상 상황'인지 판단합니다.
- 판단 결과에 따라 필요한 후속 처리로 데이터를 전달합니다.

## 기술 스택
- Spring Boot
- MQTT
- RabbitMQ
- Lombok

## 문서
- [00. 아키텍처 개요](./docs/00.%20아키텍처%20개요.md)
- [01. CollectorService 구조](./docs/01.%20CollectorService%20구조.md)
- [02. 데이터 전달(EventListener)](./docs/02.%20데이터%20전달(EventListener).md)
- [03. RuleEngine](./docs/03.%20RuleEngine.md)
- [04. RabbitMQ 발행](./docs/04.%20RabbitMQ%20발행.md)

[//]: # (아래 사항은 프로젝트 진행 중 필요하다싶으면 추가)
[//]: # (- [05. RabbitMQ 실패처리]&#40;./docs/06.%20RabbitMQ%20실패처리.md&#41;)