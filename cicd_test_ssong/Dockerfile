# 1단계: 빌드
FROM maven:3.9.3-eclipse-temurin-11 AS builder

# 프로젝트 파일 복사
COPY pom.xml .
COPY src ./src

# Maven 빌드
RUN mvn clean package -DskipTests

# 2단계: 실행
FROM adoptopenjdk:11-jdk-hotspot

# 빌드 결과물 복사
COPY --from=builder target/*.jar app.jar

# 포트 노출
EXPOSE 8083

# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]
