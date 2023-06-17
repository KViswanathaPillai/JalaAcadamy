FROM LINUX

RUN sudo yum update

RUN sudo yum install maven

RUN sudo mvn -D maven.test.failure.ignore=true clean package

CMD ["java", "Jala/java/selenium/magnus/Locators/assignment1.java"]