pipeline {​​​​​​​​
    agent any
    options {​​​​​​​​
        timeout(time: 60, unit:'SECONDS') 
    }​​​​​​​​
    stages {​​​​​​​​
    
        stage('Test') {​​​​​​​​
            steps {​​​​​​​​
            
                sh 'mvn clean test -e'
            
            }​​​​​​​​
        }​​​​​​​​
    }​​​​​​​​
}​​​​​​​​