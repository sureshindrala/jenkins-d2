pipeline {
    agent any
    environment {
        DEPLOY_TO = 'production'
    }
    stages {
        stage ('deploy') {
            when {
                environment name: 'DEPLOY_TO' , value: 'production'
            }
            steps {
                echo 'Deploying'
            }
        }
        stage ('test') {
            when {
                environment name: 'DEPLOY_TO' , value: 'production'
            }
            steps {
                echo 'testing'
            }
        }
        stage ('prod') {
            when {
                environment name: 'DEPLOY_TO' , value: 'productions'
            }
            steps {
                echo 'Print prod'
            }
        }
    }
}


////allof- All conditions should be satisfied.

pipeline {
    agent any
    environment {
        DEPLOY_TO = 'production'
    }
    stages {
        stage ('deploy') {
            when {
                allof {
                      environment name: 'DEPLOY_TO' , value: 'productions'
                }   
            }
            steps {
                echo 'Deploying'
            }
        }
        stage ('test') {
            when {
                environment name: 'DEPLOY_TO' , value: 'production'
            }
            steps {
                echo 'testing'
            }
        }
        stage ('prod') {
            when {
                allof {
                      environment name: 'DEPLOY_TO' , value: 'productions'
                }
                
            }
            steps {
                echo 'Print prod'
            }
        }
    }
}