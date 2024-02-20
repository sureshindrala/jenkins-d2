pipeline {
    agent any
    stages {
        stage ("Multibranch pipeline") {
            steps {
                echo "This is multibranch pipeline"
            }
        }
    }
}

