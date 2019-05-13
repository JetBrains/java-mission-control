#!/bin/sh
(cd releng/third-party && mvn p2:site && mvn jetty:run)&
while ! curl http://localhost:8080/site/;
do
	echo sleeping;
	sleep 1;
done;
echo Connected!;
cd core/
mvn clean package
#TODO you should kill jetty server with 'jetty:stop'