pipeline {
    agent any
    stages {
        stage ('Running parallel environments') {
            parallel {
            stage ('sonar:sonar') {
                steps {
                    echo "sonar stage completed"
                    sleep 10
                }
            }
            stage ('checkmark scan') {
                steps {
                    echo "checkmark scan completed"
                    sleep 10
                    
                }
            }
            stage ('fortify scan') {
                steps {
                    echo "fortify scan completed"
                    sleep 10
                }
            }
        }

        }
        stage ('dev') {
            steps {
                echo "development stage completed"
            }
        }
        stage ('test') {
            steps {
                echo "testing stage completed"
            }
        }
        
    }
}