#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL

    CREATE USER adminrs PASSWORD 'adminrs';

    CREATE DATABASE bd_perfiles OWNER adminrs;
    GRANT ALL PRIVILEGES ON DATABASE bd_perfiles TO adminrs;
    
    CREATE DATABASE bd_publicaciones OWNER adminrs;
    GRANT ALL PRIVILEGES ON DATABASE bd_publicaciones TO adminrs;
    
    CREATE DATABASE bd_solicitud_amistad OWNER adminrs;
    GRANT ALL PRIVILEGES ON DATABASE bd_solicitud_amistad TO adminrs;
    
        CREATE DATABASE bd_mensajes OWNER adminrs;
    GRANT ALL PRIVILEGES ON DATABASE bd_mensajes TO adminrs;
    
EOSQL
