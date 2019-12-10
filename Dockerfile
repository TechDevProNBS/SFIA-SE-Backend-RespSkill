FROM java:8-jdk-alpine

COPY ./target/SkillLevelApplication.jar /usr/app/

ENTRYPOINT ["java","-jar","usr/app/SkillLevelApplication.jar"]
