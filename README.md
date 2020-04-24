# redis-thymeleaf

개인적으로 도커로 redis 띄워놓고 연동했습니다.


주로 사용하는 redis 도커 명령어입니다.</br>
docker run --name myredis -d -p 6379:6379 redis</br>
docker run -it --link myredis:redis --rm redis redis-cli -h redis -p 6379


도커가 켜져 있는경우입니다.</br>
docker exec -it [컨테이너이름] /bin/bash</br>
redis-cli</br>

reids 비밀번호 적용하는 법</br>
config get requirepass</br>
config set requirepass [비밀번호]</br>
비밀번호 치는법</br>
auth [비밀번호] </br>

localhost:8080/HelloRedis</br>
접속하게되면 도커에 key가 새롭게 등록되는걸로 연동 확인 가능합니다</br>
