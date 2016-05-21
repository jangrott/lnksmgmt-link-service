FROM java:8

ADD build/libs/link-service-1.0-SNAPSHOT.jar linkServiceApp.jar

RUN bash -c 'touch /linkServiceApp.jar'

EXPOSE 9010

CMD ["java", "-jar", "/linkServiceApp.jar"]