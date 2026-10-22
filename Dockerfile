FROM maven:3.10-eclipse-temurin-25 AS builder

WORKDIR /build

COPY pom.xml .

RUN mvn dependency:go-offline -B

COPY src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:25-jre-alpine

RUN addgroup -g 1011 -S appuser && adduser -u 1011 -S appuser -G appuser

WORKDIR /torgash

COPY --from=builder /build/target/torgash-0.0.1-SNAPSHOT.jar torgash.jar

USER appuser

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "torgash.jar"]