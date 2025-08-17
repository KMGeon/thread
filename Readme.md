# 🧵 Java Thread 완전 가이드

> **Java 멀티스레드 프로그래밍의 모든 것을 다루는 종합 학습 자료**

---

## 📖 프로젝트 소개

이 프로젝트는 Java 멀티스레드 프로그래밍에 대한 **완전하고 실무적인 가이드**입니다. 기초 개념부터 고급 패턴까지, 이론과 실습을 통해 Java 동시성 프로그래밍을 마스터할 수 있도록 구성되었습니다.

### 🎯 학습 목표
- Java Thread 생명주기와 상태 관리 완전 이해
- 메모리 가시성과 volatile 키워드 활용
- Thread Join과 동기화 메커니즘 마스터
- 인터럽트 처리와 안전한 스레드 종료 방법
- 실무에서 바로 적용 가능한 멀티스레드 패턴

---

## 📚 학습 자료 목차

### 1. [🧬 Thread 생명주기 완전 가이드](./docs/Thread_LifeCycle.md)
> **Java Thread의 모든 상태와 전환 과정을 상세히 분석**

- **Thread State 상세 분석**: NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED
- **실전 시나리오별 상태 전환**: 코드 예제와 함께 실제 동작 이해
- **RUNNABLE 상태 심화**: Running vs Ready 내부 상태 분석
- **일시 중지 상태 비교**: BLOCKED vs WAITING vs TIMED_WAITING 차이점
- **메서드별 상태 변화**: join(), sleep(), wait() 등 메서드 영향 분석
- **성능 고려사항**: 상태 전환 비용과 최적화 방법

### 2. [🔗 Thread Join 완전 가이드](./docs/Thread_LifeCycle.md#-thread-join-완전-가이드)
> **스레드 간 동기화와 완료 대기의 모든 것**

- **Join 개념과 동작 원리**: 내부 메커니즘과 wait/notify 구조
- **실전 시나리오별 활용**: 순차 실행, 병렬 작업 결과 수집, 타임아웃 처리
- **다른 동기화 메커니즘 비교**: CountDownLatch, Future, CompletableFuture와 비교
- **주의사항과 함정**: 데드락 위험과 인터럽트 처리
- **고급 패턴**: 조건부 Join, 진행률 모니터링, Graceful Shutdown
- **성능 최적화**: 효율적인 Join 사용법과 대안 방법

### 3. [🧠 Memory Visibility & Volatile 완전 가이드](./docs/volatile.md)
> **메모리 가시성 문제와 volatile 키워드의 완전한 이해**

- **메모리 가시성 개념**: CPU 캐시와 메인 메모리 구조
- **가시성 문제 실제 분석**: 문제 발생 조건과 해결 과정
- **volatile 동작 원리**: 캐시 우회와 메인 메모리 직접 접근
- **성능 영향 분석**: 467% 오버헤드와 영향 요인
- **Java Memory Model**: happens-before 규칙과 메모리 순서 보장
- **실전 패턴**: 더블 체크 락킹, Producer-Consumer, 진행률 모니터링
- **사용 가이드라인**: 적절한 사용 시나리오와 한계

### 4. [⚡ Thread 인터럽트 완전 가이드](./docs/인터럽트.md)
> **스레드 중단과 인터럽트 처리의 모든 것**

- **변수 vs 인터럽트 중단 비교**: 즉시 반응과 지연 반응 차이
- **인터럽트 동작 메커니즘**: 플래그 설정과 예외 발생 시점
- **isInterrupted() vs interrupted()**: 상태 확인과 리셋의 차이
- **Thread.yield() 활용**: CPU 효율 개선과 스레드 양보
- **실행 시나리오 분석**: 타임라인별 상태 변화와 성능 비교
- **베스트 프랙티스**: 안전한 인터럽트 처리와 조합 사용법

---

## 🛠️ 실습 코드 구조

```
src/main/java/me/geon/thread/
├── ThreadInfo.java           # Thread 정보 및 상태 확인
├── ThreadState.java          # Thread 상태 변화 실습
├── Join.java                 # Thread Join 기본 사용법
├── JoinSleep.java           # Join과 Sleep 조합 패턴
├── Interrupt.java           # 변수 기반 스레드 중단
├── Interrupt2.java          # 인터럽트 기반 스레드 중단
├── volatile_1.java          # 메모리 가시성 문제와 해결
└── Utils.java               # 공통 유틸리티 메서드
```

---

## 🚀 빠른 시작

### 1. 프로젝트 클론
```bash
git clone [repository-url]
cd thread
```

### 2. 개발 환경 설정
- **Java**: 17 이상
- **Gradle**: 8.0 이상
- **IDE**: IntelliJ IDEA 또는 Eclipse 권장

### 3. 빌드 및 실행
```bash
# 프로젝트 빌드
./gradlew build

# 특정 예제 실행
./gradlew run --args="ThreadInfo"
```

---

## 📈 학습 로드맵

### 🥉 **초급 (기초 이해)**
1. [Thread 생명주기 기본](./docs/Thread_LifeCycle.md#1-thread-state-상세-분석) 이해
2. [간단한 Join 사용법](./docs/Thread_LifeCycle.md#-thread-join-완전-가이드) 익히기
3. [메모리 가시성 문제](./docs/volatile.md#3-가시성-문제-실제-예제-분석) 인식

### 🥈 **중급 (실무 적용)**
1. [복잡한 상태 전환](./docs/Thread_LifeCycle.md#2-상태-전환-시나리오-분석) 패턴 학습
2. [고급 Join 패턴](./docs/Thread_LifeCycle.md#6-고급-join-패턴) 활용
3. [volatile 실전 패턴](./docs/volatile.md#8-실전-패턴과-베스트-프랙티스) 적용

### 🥇 **고급 (마스터)**
1. [성능 최적화](./docs/Thread_LifeCycle.md#8-성능-고려사항) 기법
2. [JMM과 happens-before](./docs/volatile.md#6-java-memory-model과-happens-before) 완전 이해
3. [인터럽트 고급 활용](./docs/인터럽트.md#6-threadyield를-이용한-cpu-효율-개선) 패턴
