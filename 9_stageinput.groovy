pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                timeout (time:300, unit:'SECONDS') {
                    input message : "Are you building the application" , ok:"yes" , submitter: "Suresh I"
                }
                echo "building the application"
            }
        }
    }
}

pipeline {
    agent any
}