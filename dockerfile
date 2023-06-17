FROM amazonlinux

MAINTAINER Aftab Mulani <aftabmulani001@gmail.com>
WORKDIR "test1"

RUN yum update -y

RUN yum install git -y

RUN yum install maven -y

RUN git clone https://github.com/AftabMulani11/test1.git

RUN cd test1/

CMD ["sudo mvn -D maven.test.failure.ignore=true clean package"]