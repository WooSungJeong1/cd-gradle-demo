#!/bin/bash

echo "> Run Server's Deploy.sh"

sshpass -p msl1234~ ssh -o StrictHostKeyChecking=no ci@10.122.64.49

cd /Ci/jws/

pwd

./deploy.sh