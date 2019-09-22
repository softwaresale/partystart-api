#!/bin/bash
docker run --name partystart-mysql -p 3306 -e MYSQL_ROOT_PASSWORD=password -d mysql
