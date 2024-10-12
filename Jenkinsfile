pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                echo 'Building by pulling from github...'
                mvn clean package
            }
        }
        stage('Test') {
            steps {
                echo 'Testing after pulling from github...'
                mvn test
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}
