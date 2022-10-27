pipeline {
    agent any 
    triggers {
        cron('0 * * * 1-5')
    }
    stages {
        stage('Pipeline to seed or update all pipelines') {
            steps {
                jobDsl  targets: ['*.groovy'].join('\n')
            }
        }
    }
}
