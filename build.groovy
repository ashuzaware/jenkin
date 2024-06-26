pipeline {
    agent any
    stages {
        stage('Pull') {
            steps {
                git 'https://github.com/ashuzaware/studentapp-ui-ashu.git'
            }
        }
        stage('Build') {
            steps { 
                 sh 'mvn clean package '
            }
        }
        stage('Test') {
            steps {
                echo '"Test successfully"'
            }
        }
        stage('Deploy') {
            steps {
                echo '"Deploy successfully"'
            }
        }
    }
