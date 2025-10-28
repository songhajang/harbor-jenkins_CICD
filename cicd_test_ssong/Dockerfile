# 1단계: 런타임 환경
FROM eclipse-temurin:17-jre

# 컨테이너 작업 디렉토리 설정
WORKDIR /app

# 호스트에서 빌드된 JAR 파일을 컨테이너로 복사
# 예: build/libs/springbootapp.jar
COPY cicd_test_ssong/target/*.jar app.jar

# 서비스 포트 설정 (필요 시 변경 가능)
EXPOSE 8083

# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
