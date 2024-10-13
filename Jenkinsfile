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
            steps {
                script {
                    if (params.ACTION == 'Start') {
                        echo "Starting the Java Application"
                        // Run the Java app in the background
                        bat 'start /B java -jar target/project-retail-store-sb-restful-hateoas-hiber-sec-mysql-0.0.1-SNAPSHOT.jar > app.log 2>&1 &'
                    } else if (params.ACTION == 'Stop') {
                        echo "Stopping the Java Application"
                        // Stopping the application (see Stop section)
                        bat 'taskkill /F /IM java.exe'
                    }
                }
            }
        }

    }
}
