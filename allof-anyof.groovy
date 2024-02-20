pipeline {
    agent any
    environment {
        DEPLOY_TO = 'production'
    }
    stages {
        stage ('deploy') {
            when {
                anyOf {
                      environment name: 'DEPLOY_TO' , value: 'prod'
                }   
            }
            steps {
                echo 'Deploying'
            }
        }
        stage ('test') {
            when {
                anyOf {
                    environment name: 'D',value: 'production'
                }
                        }
            steps {
                echo 'testing'
            }
        }
        stage ('prod') {
            when {
                anyOf {
                      environment name: 'DEPLOY_TO' , value: 'productions'
                }
            }
            steps {
                echo 'Print prod'
            }
        }
    }
}

///////anyOf

pipeline {
    agent any 
    environment {
        DEPLOY_TO = 'production' // this is static, we shall see about dynamic in parameter section
    }
    stages {
        stage ('Build') {
            steps {
                echo "Welcome to Build Stage"
            }
        }
        stage ('Depkoy to dev') {
            steps {
                echo "Deploying to dev environment"
            }
        }
        stage ('Deploy to Stage') {
            when {
                anyOf {
                    // any of the below condition can be satisifed for this stage to be executed 
                    branch 'production'
                    environment name: 'DEPLOY_TO', value: 'productions'
                }
            }
            steps {
                echo "Deploying to Stage Environment "
            }
        }
    }
}
