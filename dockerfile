FROM amazonlinux

MAINTAINER Aftab Mulani <aftabmulani001@gmail.com>
WORKDIR "/test1/test1/"

RUN yum update -y

RUN dnf install java-11-amazon-corretto -y

RUN yum install git -y

RUN yum install maven -y

RUN git clone https://github.com/AftabMulani11/test1.git

RUN cd test1/

RUN mvn clean package