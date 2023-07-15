FROM amazonlinux

MAINTAINER Aftab Mulani <aftabmulani001@gmail.com>
WORKDIR "/var/lib/jenkins/workspace/Project 1/"

RUN yum update -y

RUN dnf install java-11-amazon-corretto -y

RUN yum install git -y

RUN yum install maven -y

RUN mvn pom.xml clean package
