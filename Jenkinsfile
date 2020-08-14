pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git(
                    url:'https://github.com/devusing/cd-gradle-demo.git',
                    credentialsId: 'devusing',
                )
                // Run Maven on a Unix agent.
                sh "./gradlew clean build"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    archiveArtifacts 'build/libs/*.jar'
                }
            }
        }

        stage('Deploy'){
            steps{
                sh 'sshpass -p msl1234~ scp -v -o StrictHostKeyChecking=no build/libs/*.jar ci@10.122.64.49:/CI/jws/'
            }
        }
        stage('Done'){
            steps{
                sh 'echo "DONE !!"'
            }
        }
    }
}
