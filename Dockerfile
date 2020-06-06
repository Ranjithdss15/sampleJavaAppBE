FROM java

ADD . .

ENTRYPOINT ["java"]


CMD ["-jar", "target/app.jar"]


