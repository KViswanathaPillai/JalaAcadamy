FROM amazonlinux

MAINTAINER Aftab Mulani <aftabmulani001@gmail.com>
WORKDIR "Jala-Java-Selenium"

RUN yum update

RUN yum install git

RUN yum install maven

CMD ["sudo mvn -D maven.test.failure.ignore=true clean package"]