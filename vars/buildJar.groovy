#!/user/bin/env groovy

def call() {
    echo 'building the jar file for the application'
    sh 'mvn package'
}