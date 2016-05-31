FROM java:8

ADD build/libs/link-service-*.jar linkServiceApp.jar

RUN bash -c 'touch /linkServiceApp.jar'

EXPOSE 8771

CMD ["java", "-jar", "/linkServiceApp.jar"]