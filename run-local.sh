#!/usr/bin/env bash

cd api-red-social-perfil
./generaImagen.sh

cd ../

cd api-red-social-publicacion
./generaImagen.sh

cd ../

cd aplication-discovery-service
./generaImagen.sh

cd ../

cd arquitectura-monitor-service
./generaImagen.sh

cd ../

cd api-solicitud-amistad
./generaImagen.sh

cd ../

docker-compose up --build

docker-compose stop
docker-compose kill
docker-compose rm -f
