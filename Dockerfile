FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
COPY target/demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 9000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo.jar"]
