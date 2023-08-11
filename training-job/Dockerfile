FROM openjdk:19
VOLUME /mnt/d/Training/Kube
ARG JAR_FILE=target/training-job-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} kube-trng-job.jar
ENTRYPOINT ["java","-jar","/kube-trng-job.jar"]