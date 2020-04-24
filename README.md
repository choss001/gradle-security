# redis-thymeleaf

개인적으로 도커로 redis 띄워놓고 연동했습니다.


주로 사용하는 redis 도커 명령어입니다.
docker run --name myredis -d -p 6379:6379 redis
docker run -it --link myredis:redis --rm redis redis-cli -h redis -p 6379


도커가 켜져 있는경우입니다.
docker exec -it [컨테이너이름] /bin/bash
redis-cli

reids 비밀번호 적용하는 법
config get requirepass
config set requirepass [비밀번호]
비밀번호 치는법
auth [비밀번호] 

localhost:8080/HelloRedis
접속하게되면 도커에 key가 새롭게 등록되는걸로 연동 확인 가능합니다
