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
//                 sh "./gradlew clean build"
                sh 'echo "BUILD !! " '
                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

//             post {
//                 // If Maven was able to run the tests, even if some of the test
//                 // failed, record the test results and archive the jar file.
//                 success {
//                     archiveArtifacts 'build/libs/*.jar'
//                 }
//             }
        }

        stage('Deploy'){
//             when { tag '*' }
                  steps {
                      sh 'echo "deploy"'
                  }
        }
        stage('Done'){
            steps{
                sh 'echo "DONE ~!"'
            }
        }
    }
}
