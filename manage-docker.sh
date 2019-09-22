#!/bin/bash
docker cp init-db.sql partystart-mysql:init-db.sql 
docker exec -it partystart-mysql /bin/sh -c 'mysql --password < init-db.sql'
