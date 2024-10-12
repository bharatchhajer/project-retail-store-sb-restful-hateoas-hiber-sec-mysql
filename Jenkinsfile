pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                echo 'Building by pulling from github...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing after pulling from github...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}
