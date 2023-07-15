FROM amazonlinux

MAINTAINER Aftab Mulani <aftabmulani001@gmail.com>
WORKDIR "/var/lib/jenkins/workspace/Project 1/"

COPY pom*.xml ./

RUN yum update -y

RUN dnf install java-11-amazon-corretto -y

COPY . .

RUN yum install maven -y

RUN mvn clean package
