pipeline {
    agent any
    parameters {
        choice(name: 'ACTION', choices: ['Start', 'Stop'], description: 'Choose Start or Stop the application')
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building by pulling from github...'
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing after pulling from github...'
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // bat 'java -jar target/project-retail-store-sb-restful-hateoas-hiber-sec-mysql-0.0.1-SNAPSHOT.jar'
            }
        }
        stage('Control Application') {
            when {
                expression { params.ACTION == 'Start' }
            }
            steps {
                script {
                        echo "Starting the Java Application"
                        // Run the Java app in the background
                        bat 'start /B java -jar target/project-retail-store-sb-restful-hateoas-hiber-sec-mysql-0.0.1-SNAPSHOT.jar > app.log 2>&1 & echo !%PROCESS_ID! > pid.txt' 
                }
            }
        }
        stage('Stop Application') {
            when {
                expression { params.ACTION == 'Stop' }
            }
            steps {
                script {
                    // Read the PID from the file and kill the process
                    def pid = readFile('pid.txt').trim()
                    bat "taskkill /F /PID ${pid}"
                }
            }
        }
    }
}
