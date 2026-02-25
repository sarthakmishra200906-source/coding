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