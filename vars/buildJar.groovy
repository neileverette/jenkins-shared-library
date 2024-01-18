#!/user/bin/env groovy

def call() {
    echo 'building the jar file for branch $BRANCH_NAME'
    sh 'mvn package'
}