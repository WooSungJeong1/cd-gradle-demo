pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git(
                    url:'https://github.com/WooSungJeong1/cd-gradle-demo.git',
                    credentialsId: '2e4c9062-dc25-4dfc-801e-1d3ea43d040f',
                )
                // Run Maven on a Unix agent.
                script{
                    try {
                        sh "./gradlew clean build"
                        slackSend message: 'Build Success'
                        sh "echo BUILD SUCCESS"
                    }catch (e){
                        slackSend color: '#BADA55', message: 'Build Fail'
                        sh "echo BUILD FAIL"
                    }
                }
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
                sh 'sshpass -p msl1234~ scp -v -o StrictHostKeyChecking=no build/libs/*.jar ci@10.122.64.49:/CI/jws/multi/'
            }
        }
        stage('Done'){
            steps{
                sh 'echo "DONE !!"'
                slackSend color: '#BADA55', message: 'Build Done !! '

            }
        }
    }
}
