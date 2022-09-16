pipeline {
    agent any
    stages {
        stage("Test") {
            steps {
                script {
                    test()
                }
            }
        }
        stage("Build") {
            steps {
                script {
                    build()
                }
            }
        }
        stage("Publish") {
            steps {
                script {
                    publish()
                }
            }
        }
        stage("Deploy") {
            steps {
                script {
                    deploy()
                }
            }
        }
    }
}