# 1단계: Maven 빌드
FROM maven:3.9.3-eclipse-temurin-11 AS builder

# 작업 디렉토리 설정
WORKDIR /app

# 의존성 캐시를 위해 먼저 pom.xml만 복사
COPY cicd_test_ssong/pom.xml .

# 의존성 미리 다운로드 (빌드 캐시 최적화)
RUN mvn dependency:go-offline -B

# 소스 코드 복사
COPY cicd_test_ssong/src ./src


# Spring Boot 애플리케이션 빌드
RUN mvn clean package -DskipTests

# 2단계: 실행 환경
FROM eclipse-temurin:11-jre

# 작업 디렉토리 설정
WORKDIR /app

# 빌드 결과물 복사 (Spring Boot의 기본 빌드 결과물 위치: target/*.jar)
COPY --from=builder /app/target/*.jar app.jar

# 서비스 포트 (Spring Boot 기본 포트 8080)
EXPOSE 8083

# 실행 명령
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
