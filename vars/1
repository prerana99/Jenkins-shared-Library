def call(String containerName = "django-todo", String imageName = "django-todo:latest", String port = "8000") {
    echo "Running Docker container with name ${containerName} and image ${imageName}"
    sh """
        docker stop ${containerName} || true
        docker rm ${containerName} || true
        docker run -d --name ${containerName} -p ${port}:${port} ${imageName}
    """
}

