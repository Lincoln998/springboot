# 1.install
- [x] 1.sudo yum install docker-ce
- [x] 2.sudo systemctl start docker
- [x] 3.sudo docker run hello-world

# 2.command
````
docker --version
docker info
#构建命令(-t 指定一个名称)
docker build -t name
# 重启docker服务
sudo service docker restart
# 运行该应用程序，将您的机器的4000端口映射到container发布的80端口
docker run -p 4000:80 friendlyhello
#后台运行
docker run -d -p 4000:80 friendlyhello
#docker 机器ip
docker-machine ip
docker container ls
#停止运行
docker container stop 1fa4ab2cf395(CONTAINER ID)
````

# 3.dockerfile
```
# Use an official Python runtime as a parent image
FROM python:2.7-slim

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Install any needed packages specified in requirements.txt
RUN pip install --trusted-host pypi.python.org -r requirements.txt

# Make port 80 available to the world outside this container
EXPOSE 80

# Define environment variable
ENV NAME World
# Set proxy server, replace host:port with values for your servers
ENV http_proxy host:port
ENV https_proxy host:port
# Run app.py when the container launches
CMD ["python", "app.py"]
```
#4.docker-compose.yml
  ---- 定义了 Docker 容器在生产过程中应该如何运行。
```
version: "3"
services:
  web:
    # replace username/repo:tag with your name and image details
    image: username/repo:tag
    deploy:
      replicas: 5
      resources:
        limits:
          cpus: "0.1"
          memory: 50M
      restart_policy:
        condition: on-failure
    ports:
      - "4000:80"
    networks:
      - webnet
networks:
  webnet:
```
#5.load-balance
```
docker swarm init(在使用我们第一次运行的 docker 堆栈部署命令之前:)
docker stack deploy -c docker-compose.yml getstartedlab
#Take the app down with docker stack rm:
docker stack rm getstartedlab
#Take down the swarm.
docker swarm leave --force

```