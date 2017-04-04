pipeline {
    agent any
     
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
          stage('Run python script') {
            steps {
                
    sh('python myscript.py')
                
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
