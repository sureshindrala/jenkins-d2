///environment pipelines

pipeline {
    agent any
    environment {
        name = "Surya"
        course = "Devops"
    }
    stages {
        stage ('build') {
            steps {
                echo "You are enrolled ${course}"
                echo "Thanks for enrollong ${name}"
            }

        }
        stage ('Test') {
            environment {
                certification = "gcp"
            }
            steps {
                echo "${certification} must for this position"
                sh "printenv"
            }
        }
        
    }
}

