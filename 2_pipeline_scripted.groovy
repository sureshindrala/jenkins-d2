// Scripted pipeline ///
pipeline {
    agent any
    stages {
        stage ("scriptStage") {
            steps {
                echo "Script stage started"
                script {
                    def course = "k8s"
                    if (course == "k8s") {
                        println ("Thanks for choosing ${course}")
                    }
                    else 
                    println ("Do enroll immediately")
                }
            }
        }
    }
}

//next scripted stage

pipeline {
    agent any
    stages {
        stage ("teststage") {
            steps {
                script {
                    def course = "docker"
                    if (course == "docker") {
                        println ("Thanks for choosing ${course}")
                    }
                    else
                    println ("Do enrol ${course} immedieately")
                }
            }
        }
    }
}


pipeline {
    agent any
}