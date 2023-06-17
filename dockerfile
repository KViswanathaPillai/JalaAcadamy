FROM LINUX

RUN sudo yum update

RUN sudo yum install maven

RUN sudo mvn -D maven.test.failure.ignore=true clean package