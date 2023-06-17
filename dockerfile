FROM amazonlinux

MAINTAINER Aftab Mulani <aftabmulani001@gmail.com>
WORKDIR "Jala-Java-Selenium"

RUN yum update -y

RUN yum install git -y

RUN yum install maven -y

CMD ["sudo mvn -D maven.test.failure.ignore=true clean package"]