pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh "mvn clean"
            }
        }

        stage('test') {
            steps {
                sh "mvn compile"
            }
        }

        stage('test2') {
            steps {
                sh '''
                    mvn test
                '''
            }
        }
    }
}