-----intro of docker----
virciulation ->
   1 physical computer (
     1appenda, 2 appendb
     1 may depend on some verson and 2 on some on another version
     )
     we took physical system 
     we made software hypervisor->software
     it is possible by isa (x64)
     ve make indivisual os on hypervisor 
     and then ve run appp on indivisual os 

ocker<namespace><command>
  Command 'doker' not found, did you mean:
  command 'docker' from snap docker (28.4.0)
  command 'docker' from deb docker.io (28.2.2-0ubuntu1~24.04.1)
  command 'docker' from deb podman-docker (4.9.3+ds1-1ubuntu0.2)
See 'snap info <snapname>' for additional versions.
sarthak@DESKTOP-39G6DQ5:/mnt/c/Windows/SystemApps/MicrosoftWindows.Client.CBS_cw5n1h2txyewy$ docker -h
Flag shorthand -h has been deprecated, use --help
Usage:  docker [OPTIONS] COMMAND

A self-sufficient runtime for containers

Common Commands:
  run         Create and run a new container from an image
  exec        Execute a command in a running container
  ps          List containers
  build       Build an image from a Dockerfile
  bake        Build from a file
  pull        Download an image from a registry
  push        Upload an image to a registry
  images      List images
  login       Authenticate to a registry
  logout      Log out from a registry
  search      Search Docker Hub for images
  version     Show the Docker version information
  info        Display system-wide information

Management Commands:
  ai*         Docker AI Agent - Ask Gordon
  builder     Manage builds
  buildx*     Docker Buildx
  compose*    Docker Compose
  container   Manage containers
  context     Manage contexts
  debug*      Get a shell into any image or container
  desktop*    Docker Desktop commands
  extension*  Manages Docker extensions
  image       Manage images
  init*       Creates Docker-related starter files for your project
  manifest    Manage Docker image manifests and manifest lists
  mcp*        Docker MCP Plugin
  model*      Docker Model Runner
  network     Manage networks
  offload*    Docker Offload
  plugin      Manage plugins
  sandbox*
  sbom*       View the packaged-based Software Bill Of Materials (SBOM) for an image
  scout*      Docker Scout
  system      Manage Docker
  volume      Manage volumes

Swarm Commands:
  swarm       Manage Swarm

Commands:
  attach      Attach local standard input, output, and error streams to a running container
  commit      Create a new image from a container's changes
  cp          Copy files/folders between a container and the local filesystem
  create      Create a new container
  diff        Inspect changes to files or directories on a container's filesystem
  events      Get real time events from the server
  export      Export a container's filesystem as a tar archive
  history     Show the history of an image
  import      Import the contents from a tarball to create a filesystem image
  inspect     Return low-level information on Docker objects
  kill        Kill one or more running containers
  load        Load an image from a tar archive or STDIN
  logs        Fetch the logs of a container
  pause       Pause all processes within one or more containers
  port        List port mappings or a specific mapping for the container
  rename      Rename a container
  restart     Restart one or more containers
  rm          Remove one or more containers
  rmi         Remove one or more images
  save        Save one or more images to a tar archive (streamed to STDOUT by default)
  start       Start one or more stopped containers
  stats       Display a live stream of container(s) resource usage statistics
  stop        Stop one or more running containers
  tag         Create a tag TARGET_IMAGE that refers to SOURCE_IMAGE
  top         Display the running processes of a container
  unpause     Unpause all processes within one or more containers
  update      Update configuration of one or more containers
  wait        Block until one or more containers stop, then print their exit codes

Global Options:
      --config string      Location of client config files (default "/home/sarthak/.docker")
  -c, --context string     Name of the context to use to connect to the daemon (overrides DOCKER_HOST env var and
                           default context set with "docker context use")
  -D, --debug              Enable debug mode
  -H, --host string        Daemon socket to connect to
  -l, --log-level string   Set the logging level ("debug", "info", "warn", "error", "fatal") (default "info")
      --tls                Use TLS; implied by --tlsverify
      --tlscacert string   Trust certs signed only by this CA (default "/home/sarthak/.docker/ca.pem")
      --tlscert string     Path to TLS certificate file (default "/home/sarthak/.docker/cert.pem")
      --tlskey string      Path to TLS key file (default "/home/sarthak/.docker/key.pem")
      --tlsverify          Use TLS and verify the remote
  -v, --version            Print version information and quit

Run 'docker COMMAND --help' for more information on a command.

For more help on how to use Docker, head to https://docs.docker.com/go/guides/
un 'docker COMMAND --help' for more information on a command.

For more help on how to use Docker, head to https://docs.docker.com/go/guides/
sarthak@DESKTOP-39G6DQ5:/mnt/c/Windows/SystemApps/MicrosoftWindows.Client.CBS_cw5n1h2txyewy$ docker image ls
                                                                                                    i Info →   U  In Use
IMAGE                ID             DISK USAGE   CONTENT SIZE   EXTRA
hello-world:latest   ef54e839ef54       25.9kB         9.52kB    U
sarthak@DESKTOP-39G6DQ5:/mnt/c/Windows/SystemApps/MicrosoftWindows.Client.CBS_cw5n1h2txyewy$ docker network ls
NETWORK ID     NAME      DRIVER    SCOPE
9bd3f1d43564   bridge    bridge    local
f8f45df6ccfb   host      host      local
84b1f55b540f   none      null      local
sarthak@DESKTOP-39G6DQ5:/mnt/c/Windows/SystemApps/MicrosoftWindows.Client.CBS_cw5n1h2txyewy$ docker container ls
CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES
sarthak@DESKTOP-39G6DQ5:/mnt/c/Windows/SystemApps/MicrosoftWindows.Client.CBS_cw5n1h2txyewy$
n
sarthak@DESKTOP-39G6DQ5:/mnt/c/Windows/SystemApps/MicrosoftWindows.Client.CBS_cw5n1h2txyewy$ docker container ls -a
CONTAINER ID   IMAGE         COMMAND    CREATED             STATUS                         PORTS     NAMES
f5e1080787ca   hello-world   "/hello"   11 minutes ago      Exited (0) 11 minutes ago                angry_faraday
97701b31d7af   hello-world   "/hello"   About an hour ago   Exited (0) About an hour ago             interesting_newton
8a09969de7ed   hello-world   "/hello"   2 hours ago         Exited (0) 2 hours ago           
   
     ntainer ls
CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES
sarthak@DESKTOP-39G6DQ5:~$ docker container ls
CONTAINER ID   IMAGE                       COMMAND                  CREATED         STATUS         PORTS                                         NAMES
b961800e278f   clubexcel/docker-workshop   "docker-entrypoint.s…"   6 seconds ago   Up 5 seconds   0.0.0.0:3000->3000/tcp, [::]:3000->3000/tcp   youthful_kirch
sarthak@DESKTOP-39G6DQ5:~$ docker container ls -a
CONTAINER ID   IMAGE                       COMMAND                  CREATED              STATUS                          PORTS                                         NAMES
b961800e278f   clubexcel/docker-workshop   "docker-entrypoint.s…"   56 seconds ago       Up 54 seconds                   0.0.0.0:3000->3000/tcp, [::]:3000->3000/tcp   youthful_kirch
d2b44d2409b0   clubexcel/docker-workshop   "docker-entrypoint.s…"   About a minute ago   Exited (0) About a minute ago                                                 cranky_margulis
ad0f30867907   clubexcel/docker-workshop   "docker-entrypoint.s…"   4 minutes ago        Exited (0) 3 minutes ago                                                      awesome_dewdney
348fae7946f0   hello-world                 "/hello"                 7 minutes ago        Exited (0) 7 minutes ago                                                      intelligent_joliot
8fa6c9652de0   clubexcel/docker-workshop   "docker-entrypoint.s…"   19 minutes ago       Exited (0) 7 minutes ago                                                      silly_ramanujan
f5e1080787ca   hello-world                 "/hello"                 45 minutes ago       Exited (0) 45 minutes ago                                                     angry_faraday
97701b31d7af   hello-world                 "/hello"                 2 hours ago          Exited (0) 2 hours ago                                                        interesting_newton
8a09969de7ed   hello-world                 "/hello"                 2 hours ago          Exited (0) 2 hours ago                                                        wizardly_kirch
sarthak@DESKTOP-39G6DQ5:~$ docker container rm 97701b31d7af
97701b31d7af
sarthak@DESKTOP-39G6DQ5:~$ docker container ls -a
CONTAINER ID   IMAGE                       COMMAND                  CREATED              STATUS                      PORTS                                         NAMES
b961800e278f   clubexcel/docker-workshop   "docker-entrypoint.s…"   About a minute ago   Up About a minute           0.0.0.0:3000->3000/tcp, [::]:3000->3000/tcp   youthful_kirch
d2b44d2409b0   clubexcel/docker-workshop   "docker-entrypoint.s…"   2 minutes ago        Exited (0) 2 minutes ago                                                  cranky_margulis
ad0f30867907   clubexcel/docker-workshop   "docker-entrypoint.s…"   5 minutes ago        Exited (0) 4 minutes ago                                                  awesome_dewdney
348fae7946f0   hello-world                 "/hello"                 8 minutes ago        Exited (0) 8 minutes ago                                                  intelligent_joliot
8fa6c9652de0   clubexcel/docker-workshop   "docker-entrypoint.s…"   20 minutes ago       Exited (0) 8 minutes ago                                                  silly_ramanujan
f5e1080787ca   hello-world                 "/hello"                 46 minutes ago       Exited (0) 46 minutes ago                                                 angry_faraday
8a09969de7ed   hello-world                 "/hello"                 2 hours ago          Exited (0) 2 hours ago                                                    wizardly_kirch
sarthak@DESKTOP-39G6DQ5:~$ docker container rename 8a09969de7ed -prashant
unknown shorthand flag: 'p' in -prashant

Usage:  docker container rename CONTAINER NEW_NAME

Run 'docker container rename --help' for more information
sarthak@DESKTOP-39G6DQ5:~$ docker container rename 8a09969de7ed sarthak
sarthak@DESKTOP-39G6DQ5:~$ docker container ls -a
CONTAINER ID   IMAGE                       COMMAND                  CREATED          STATUS                      PORTS                                         NAMES
b961800e278f   clubexcel/docker-workshop   "docker-entrypoint.s…"   3 minutes ago    Up 3 minutes                0.0.0.0:3000->3000/tcp, [::]:3000->3000/tcp   youthful_kirch
d2b44d2409b0   clubexcel/docker-workshop   "docker-entrypoint.s…"   4 minutes ago    Exited (0) 4 minutes ago                                                  cranky_margulis
ad0f30867907   clubexcel/docker-workshop   "docker-entrypoint.s…"   7 minutes ago    Exited (0) 6 minutes ago                                                  awesome_dewdney
348fae7946f0   hello-world                 "/hello"                 10 minutes ago   Exited (0) 10 minutes ago                                                 intelligent_joliot
8fa6c9652de0   clubexcel/docker-workshop   "docker-entrypoint.s…"   22 minutes ago   Exited (0) 10 minutes ago                                                 silly_ramanujan
f5e1080787ca   hello-world                 "/hello"                 48 minutes ago   Exited (0) 48 minutes ago                                                 angry_faraday
8a09969de7ed   hello-world                 "/hello"                 2 hours ago      Exited (0) 2 hours ago                                                    sarthak
sarthak@DESKTOP-39G6DQ5:~$
docker container is actually running instance where as docer immage is static snapshot
resource is actually used by docer container 
Hello from Docker!
This message shows that your installation appears to be working correctly.

To generate this message, Docker took the following steps:
 1. The Docker client contacted the Docker daemon.
 2. The Docker daemon pulled the "hello-world" image from the Docker Hub.
    (amd64)
 3. The Docker daemon created a new container from that image which runs the
    executable that produces the output you are currently reading.     
 4. The Docker daemon streamed that output to the Docker client, which sent it
    to your terminal
    docker run --name workshop-sql -e MYSQL_ROOT_PASSWORD=my-password -p 3307:3306 -d mysql to prevent my sql from crshing 
    sarthak@DESKTOP-39G6DQ5:~$ docker run -dp 3000:3000 clubexcel/docker-worksho
Unable to find image 'clubexcel/docker-worksho:latest' locally
docker: Error response from daemon: pull access denied for clubexcel/docker-worksho, repository does not exist or may require 'docker login'

Run 'docker run --help' for more information
sarthak@DESKTOP-39G6DQ5:~$ docker run -dp 3000:3000 clubexcel/docker-workshop
Unable to find image 'clubexcel/docker-workshop:latest' locally
latest: Pulling from clubexcel/docker-workshop
2b752f7c71fd: Pull complete
820b96539f52: Pull complete
fc1c5222d85f: Pull complete
8d513d1f314d: Pull complete
589002ba0eae: Pull complete
aa2cb8bf69ce: Pull complete
0936272ed81e: Pull complete
de3d8c97cc6f: Pull complete
Digest: sha256:a8c5999524a0451111f3095454d4d6daecf53bca1eaa7196a13cbeeeb208c79d
Status: Downloaded newer image for clubexcel/docker-workshop:latest
908ed2d4fcf484faded74b12041b687a186489791edf3bec5dc4df6b2df58822
sarthak@DESKTOP-39G6DQ5:~$ docker ps
CONTAINER ID   IMAGE                       COMMAND                  CREATED         STATUS         PORTS                                         NAMES
908ed2d4fcf4   clubexcel/docker-workshop   "docker-entrypoint.s…"   6 minutes ago   Up 6 minutes   0.0.0.0:3000->3000/tcp, [::]:3000->3000/tcp   condescending_brahmagupta
sarthak@DESKTOP-39G6DQ5:~$ docker run -it ubuntu
Unable to find image 'ubuntu:latest' locally
latest: Pulling from library/ubuntu
01d7766a2e4a: Pull complete
fd8cda969ed2: Download complete
Digest: sha256:d1e2e92c075e5ca139d51a140fff46f84315c0fdce203eab2807c7e495eff4f9
Status: Downloaded newer image for ubuntu:latest
root@1e6ce40613c8:/# ls
bin   dev  home  lib64  mnt  proc  run   srv  tmp  var
boot  etc  lib   media  opt  root  sbin  sys  usr
root@1e6ce40613c8:/# mkdir data
root@1e6ce40613c8:/# exit
exit
sarthak@DESKTOP-39G6DQ5:~$ docker volume creat ubuntu-data
docker: unknown command: docker volume creat

Usage:  docker volume COMMAND

Run 'docker volume --help' for more information
sarthak@DESKTOP-39G6DQ5:~$ docker volume create ubuntu-data
ubuntu-data
sarthak@DESKTOP-39G6DQ5:~$ docker volume ls
DRIVER    VOLUME NAME
local     ubuntu-data
sarthak@DESKTOP-39G6DQ5:~$ docker run -v ubuntu-data:/data ubuntu
sarthak@DESKTOP-39G6DQ5:~$ docker run -v -it ubuntu-data:/data ubuntu
docker: invalid reference format

Run 'docker run --help' for more information
sarthak@DESKTOP-39G6DQ5:~$ docker run -v ubuntu-data:/data ubuntu:22.04
Unable to find image 'ubuntu:22.04' locally
22.04: Pulling from library/ubuntu
b1cba2e842ca: Pull complete
8b74a9da3820: Download complete
Digest: sha256:3ba65aa20f86a0fad9df2b2c259c613df006b2e6d0bfcc8a146afb8c525a9751
Status: Downloaded newer image for ubuntu:22.04
sarthak@DESKTOP-39G6DQ5:~$ docker run -v ubuntu-data:/data -it ubunt:22.04
Unable to find image 'ubunt:22.04' locally
docker: Error response from daemon: pull access denied for ubunt, repository does not exist or may require 'docker login'

Run 'docker run --help' for more information
sarthak@DESKTOP-39G6DQ5:~$ ls
sarthak@DESKTOP-39G6DQ5:~$ docker ls
docker: unknown command: docker ls

Run 'docker --help' for more information
sarthak@DESKTOP-39G6DQ5:~$ docker run -it ubuntu:22.04
root@6cde7ead2a73:/# ls
bin   dev  home  lib32  libx32  mnt  proc  run   srv  tmp  var
boot  etc  lib   lib64  media   opt  root  sbin  sys  usr
root@6cde7ead2a73:/# mkdir data
root@6cde7ead2a73:/# ls
bin   data  etc   lib    lib64   media  opt   root  sbin  sys  usr
boot  dev   home  lib32  libx32  mnt    proc  run   srv   tmp  var
root@6cde7ead2a73:/# docker volume ls
bash: docker: command not found
root@6cde7ead2a73:/# exit
exit
sarthak@DESKTOP-39G6DQ5:~$ docker ps
CONTAINER ID   IMAGE                       COMMAND                  CREATED          STATUS          PORTS                                         NAMES
908ed2d4fcf4   clubexcel/docker-workshop   "docker-entrypoint.s…"   21 minutes ago   Up 21 minutes   0.0.0.0:3000->3000/tcp, [::]:3000->3000/tcp   condescending_brahmagupta
sarthak@DESKTOP-39G6DQ5:~$ docker exec -it 908ed2d4fcf4 sh
/app # cd/
sh: cd/: not found
/app # /# cd
sh: /#: not found
/app # exit
sarthak@DESKTOP-39G6DQ5:~$ docker exec -it 908ed2d4fcf4 bash
OCI runtime exec failed: exec failed: unable to start container process: exec: "bash": executable file not found in $PATH
sarthak@DESKTOP-39G6DQ5:~$ docker exec -it 908ed2d4fcf4 sh
/app # cd/
sh: cd/: not found
/app #  cd/
sh: cd/: not found
/app # scd/
sh: scd/: not found
/app # cd/
sh: cd/: not found
/app # ls
README.md          package-lock.json  spec
node_modules       package.json       src
/app # cd /etc/
/etc # ls
alpine-release   issue            os-release       services
apk              logrotate.d      passwd           shadow
busybox-paths.d  modprobe.d       passwd-          shadow-
crontabs         modules          periodic         shells
fstab            modules-load.d   profile          ssl
group            motd             profile.d        ssl1.1
group-           mtab             protocols        sysctl.conf
hostname         network          resolv.conf      sysctl.d
hosts            nsswitch.conf    secfixes.d       todos
inittab          opt              securetty        udhcpc
/etc # cd todos
/etc/todos # ls
todo.db
/etc/todos # docker volume create dodo-data
sh: docker: not found
/etc/todos # exit
sarthak@DESKTOP-39G6DQ5:~$ docker volume create todo-data
todo-data
sarthak@DESKTOP-39G6DQ5:~$ docker container ls
CONTAINER ID   IMAGE                       COMMAND                  CREATED          STATUS          PORTS                                         NAMES
908ed2d4fcf4   clubexcel/docker-workshop   "docker-entrypoint.s…"   29 minutes ago   Up 29 minutes   0.0.0.0:3000->3000/tcp, [::]:3000->3000/tcp   condescending_brahmagupta
sarthak@DESKTOP-39G6DQ5:~$ docker container stop 908ed2d4fcf4
908ed2d4fcf4
sarthak@DESKTOP-39G6DQ5:~$ docker ps
CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES
sarthak@DESKTOP-39G6DQ5:~$ docker run -v todo-data:/etc/todos/ -p 3000:3000 -d
docker: 'docker run' requires at least 1 argument

Usage:  docker run [OPTIONS] IMAGE [COMMAND] [ARG...]

See 'docker run --help' for more information
sarthak@DESKTOP-39G6DQ5:~$ docker container stop 908ed2d4fcf4
908ed2d4fcf4
sarthak@DESKTOP-39G6DQ5:~$ docker container start 908ed2d4fcf4
908ed2d4fcf4
sarthak@DESKTOP-39G6DQ5:~$

See 'docker run --help' for more information
sarthak@DESKTOP-39G6DQ5:~$ docker container stop 908ed2d4fcf4
908ed2d4fcf4
sarthak@DESKTOP-39G6DQ5:~$ docker container start 908ed2d4fcf4
908ed2d4fcf4
sarthak@DESKTOP-39G6DQ5:~$ docker run -v todo-data:/etc/todos -d -p 3000:300
0 clubexcel/docker-workshop
60435ae94b3cd09134389ee71b3f450f5c816b320e6f3fe4cd1c41ce6617b3d6
docker: Error response from daemon: failed to set up container networking: driver failed programming external connectivity on endpoint youthful_darwin (4ad3bf408d5dfa819642920351da8327ee102f0f47778a2274e9ba19ae61003e): Bind for 0.0.0.0:3000 failed: port is already allocated

Run 'docker run --help' for more information
sarthak@DESKTOP-39G6DQ5:~$ docker run -v todo-data:/etc/todos -d -p 3000:300
0 clubexcel/docker-workshop