def call(String username, String password, String img_name){
  echo "logging into docker account"
  sh "docker login -u ${username} -p ${password}"
  echo "successfully logged in"
  echo "tagging the image"
  sh "docker tag ${img_name}:latest ${username}/${img_name}:latest"
  echo "pushing the image to docker hub"
  sh "docker push ${username}/${img_name}:latest"
}
