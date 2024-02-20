///tools
pipeline {
    agent any
    tools {
        maven 'My_Maven'
    }
    stages {
        stage ('Maven Version') {
            steps {
                echo " printing maven version"
                sh "mvn --version"
            }
        }
        stage ("Jdk-17") {
            tools {
                jdk "jdk_17"
            }
            steps {
                echo "Maven with Jdk-17"
                sh "mvn --version"
            }
        }
    }
}