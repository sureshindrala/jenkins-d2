pipeline {
    agent any
    stages {
        stage ('build'){
            steps {
                echo "sleep for 25 seconds"
            sleep 25
            }
        }
            
        }
    }
    ////retry

    pipeline {
        agent any
        stages {
            stage ('retry Test') {
                steps {
                   timeout (time: 55, unit: 'SECONDS') {
                    echo "sleep for 60 seconds" 
                    sleep 56
                   }                            
                        }
                }
            }
        }

    



    /////retry (3) {
                        echo " welcome to retry tesing"
                        //error "some message"

    pipeline {
        agent any
        stages {
            stage ('pipeline test') {
                steps {
                    timeout (time:45,unit:'SECONDS') {
                    echo "Sleep for 44 seconds"
                    sleep 46
                    } 
                }
            }
        }
    }