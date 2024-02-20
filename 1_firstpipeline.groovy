pipeline {
    agent none
    stages {
        stage ("build") {
            agent {
                node {
                    label 'mvn-slave'
                    customWorkspace "/home/surya/suresh"
                }
            }
            steps {
                echo "Hello..!, existing node agent"
                sh "hostname -i"
                sh "cat test.txt"
            }
        }
    }

}
////////////////// second pipeline//////
pipeline {
    agent any
    stages {
        stage ('newbuild') {
            agent {
                node {
                    label 'mvn-slave'
                    customWorkspace "/home/surya/suryacustom"
                }
            }
            steps {
               echo "Hello..!, existing node agent"
                sh "hostname -i"
                sh "cat imp.txt" 
                }
        }
    }
}

///////Third pipeline/////////////////

pipeline {
    agent any
    stages {
        stage ('newbuild') {
            agent {
                node {
                    label 'mvn-slave'
                    customWorkspace " /home/surya/suryacustom"
                }
            }
            steps {
               echo "Hello..!, existing node agent"
                sh "hostname -i"
                git branch: 'main', url: 'https://github.com/spring-projects/spring-petclinic.git'
            }
        }
    }
}