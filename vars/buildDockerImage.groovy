def call(String imageName = "django-todo:latest") {
    echo "Building Docker image ${imageName}"
    sh "docker build -t ${imageName} ."
}

