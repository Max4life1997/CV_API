pipeline {
    agent {
        docker {
            image 'node:lts-buster-slim'
            args '-p 8989:8989'
        }
    }

    stages {

        stage('JenkinsFile-Build-Steps') {
            steps {
                echo "Start"
                echo "Doing"
                echo "End"
            }
        }
        stage('MVN Clean') {
            steps {

                echo "Производится очистка билда"

                script {

                    sh 'mvn clean compile'

                }
            }
        }
        stage('Tests Launch') {
            steps {
                container('maven') {
                    script {
                        sh 'clean test -Dspring.profiles.active=TEST'
                    }
                }
            }
        }
    }
}
