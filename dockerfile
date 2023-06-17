FROM amazonlinux

MAINTAINER Aftab Mulani <aftabmulani001@gmail.com>
WORKDIR "Jala-Java-Selenium"

CMD ["sudo", "yum", "Update"]

RUN sudo yum install git -y

CMD ["sudo yum install maven"]

CMD ["sudo mvn -D maven.test.failure.ignore=true clean package"]