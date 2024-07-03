#!/bin/bash
#

while [ "$(curl -I -m 10 -L -k -o /dev/null -s -w %{http_code} ${CORE_HOST}/api/health/)" != "200" ]
do
    echo "wait for jms_core ${CORE_HOST} ready"
    sleep 2
done

export WORK_DIR=/opt/chen
export COMPONENT_NAME=chen
export WISP_TRACE_PROCESS=1
export EXECUTE_PROGRAM="java -Dfile.encoding=utf-8 --add-opens java.base/jdk.internal.loader=ALL-UNNAMED --add-opens java.base/java.util=ALL-UNNAMED --add-opens java.base/java.lang=ALL-UNNAME -XX:+ExitOnOutOfMemoryError -jar /opt/chen/chen.jar --mock.enable=false"

if [ ! "$LOG_LEVEL" ]; then
    LOG_LEVEL=ERROR
fi

sed -i "s@root: INFO@root: ${LOG_LEVEL}@g" /opt/chen/config/application.yml

echo
date
echo "CHEN Version $VERSION, more see https://www.jumpserver.org"
echo "Quit the server with CONTROL-C."
echo

cd /opt/chen || exit 1
wisp