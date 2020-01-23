FROM hseeberger/scala-sbt:8u151-2.12.4-1.1.0
# CMD [ "sbt","new","playframework/play-scala-seed.g8","--name=example_playframework" ]
# EXPOSE 8888 9000
WORKDIR /root/example_playframework/
CMD sbt