pipeline {
    agent any
    stages {
        stage('Build') {
            environment {
                JAVA_HOME = tool('jdk-8')
            }
            steps {
                sh './mvnw clean package'
            }
        }
    }
}
