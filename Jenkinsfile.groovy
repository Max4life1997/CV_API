pipeline {
    agent {
        label 'linux'
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
//                container('maven') {
                    script {

                        sh 'mvn clean compile'

                    }
//                }
            }
        }
        stage('Tests Launch') {
            steps {
                container('maven') {
                    script {

                    }
                }
            }
        }
    }
}
