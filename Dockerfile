FROM gradle:8.5-jdk21.0.3

WORKDIR /app

COPY /app .

RUN gradle installDist

CMD ./build/install/app/bin/app
