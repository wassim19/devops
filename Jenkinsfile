pipeline {
    agent any
    tools {
        maven 'M2_HOME'
    }
    environment {
		DOCKERHUB_CREDENTIALS=credentials('wassim19')
	}
    stages {
        stage('Git') {
            steps {
                // Get some code from a GitHub repository
                git branch:'Stock-management',url:'https://github.com/wassim19/devops.git'
            }
        }
        stage('Build') {
            steps {
                sh "mvn clean"
                sh "mvn compile"
                sh "mvn package"
                // sh "mvn test"
            }
        }
//         stage('Sonarqube') {
//             steps {
//                 sh "mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=Wassim19"
//             }
//         }
        stage('Test') {
            steps {
                sh 'mvn test'
                // bat '.\\mvnw test'
            }
        }
//         stage('Deployment') {
//             steps {
//                 sh 'mvn deploy -Dmaven.test.skip=true'
//             }
//         }
        // stage('Build Docker image') {
        //     steps {//sh 'echo image_exist'
        //              sh 'docker build -t wassim19/achat .'
        //     }
        // }
        // stage('Push to Docker hub') {
        //     steps {//sh 'echo image_pushed'
        //         sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR -p $DOCKERHUB_CREDENTIALS_PSW'
        //         sh 'docker push wassim19/achat'
        //         }
        // }
        // stage('Run Docker-compose') {
        //     steps {
        //            	sh 'docker-compose up -d'
        //     	}
        // }
    }
post {
       always {
          mail to: 'wassim.chettaoui@esprit.tn',
             subject: "Status of pipeline: ${currentBuild.fullDisplayName}",
             body: "${env.BUILD_URL} has result ${currentBuild.result}"
       }
}
}
