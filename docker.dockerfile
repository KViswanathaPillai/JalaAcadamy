FROM LINUX

RUN sudo yum update

RUN sudo yum install maven

RUN sudo mvn clean install pom.xml

