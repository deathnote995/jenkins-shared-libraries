def call(String img_name){
  echo "Building the docker image for project"
  sh "docker build -t ${img_name}:latest ."
}
