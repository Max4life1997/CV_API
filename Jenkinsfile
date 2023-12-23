pipeline {
    agent {
        docker 'maven:3.8.1-adoptopenjdk-11'
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
