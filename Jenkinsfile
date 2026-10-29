pipeline {
    agent any

    tools {
        jdk 'JDK 21'
    }

    stages {
        stage('Recuperer le code') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/takoua-khedhri/gestion-livres.git'
            }
        }

        stage('Tests') {
            steps {
                bat 'mvnw.cmd test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvnw.cmd clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t livres-api:%BUILD_NUMBER% .'
            }
        }
    }
}