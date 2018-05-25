FROM ubuntu
RUN apt-get update
RUN apt-get -y install software-properties-common
RUN add-apt-repository -y ppa:linuxuprising/java
RUN apt update
RUN echo oracle-java10-installer shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections
RUN apt -y install oracle-java10-installer
COPY HelloWorld.java /
RUN  javac HelloWorld.java
ENTRYPOINT ["java","HelloWorld"]




