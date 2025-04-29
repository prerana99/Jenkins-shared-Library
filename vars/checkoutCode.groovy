def call(String repoUrl, String branch) {
    echo "Checking out code from ${repoUrl} on branch ${branch}"
    git url: repoUrl, branch: branch
}

