pipeline {
    agent any

    stages {
       stage('JenkinsFile-Build-Steps'){
           steps{
               echo "Start"
               echo "Doing"
               echo "End"
           }
       }
    }
}
