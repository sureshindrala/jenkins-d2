//// I want excute stage environment when the brach is released.

pipeline {
        agent any
    stages {
        stage ('release') {
            when {
                branch "release-*"
            }
            steps {
                echo "Deploying to stage environment"
            }
        }
        stage ('Prod') {
            when {
            tag pattern: "v\\d{1,2},d{1,2},d{1,2}", comparator: "REGEXP"
        }
        steps {
            echo " Printing production environment"
        }

        }
        
    }
}