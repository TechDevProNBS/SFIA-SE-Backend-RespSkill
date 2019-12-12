pipeline {
    agent any

    stages {
        stage('Testing Environment') {
	  when {
		expression {
			env.BRANCH_NAME=='developer'
		}
	}
            steps {
		echo "Testing"
		sh '. /home/manager/terraform-azure/ansible/ENV_VARIABLES.sh'
                sh 'mvn package -DskipTests'
		sh 'docker build --build-arg PORT_NAME=$SKILLLEVEL_PORT --build-arg PASSWORD=$MONGODB_PASSWORD_SKILLLEVEL -t="51.140.99.70:5000/sfia-skilllevel:testing" .'
                sh 'docker push 51.140.99.70:5000/sfia-skilllevel:testing'
		sh '/home/manager/terraform-azure/backEndUpdate.sh'
                }
            }


        stage('Staging') {
	  when {
		expression {
			env.BRANCH_NAME=='staging'
		}
	}
            steps {
		echo "staging"
		sh '. /home/manager/terraform-azure/ansible/ENV_VARIABLES.sh'
                sh 'mvn package -DskipTests'
		sh 'docker build --build-arg PORT_NAME=$SKILLLEVEL_PORT --build-arg PASSWORD=$MONGODB_PASSWORD_SKILLLEVEL -t="51.140.99.70:5000/sfia-skilllevel:staging" .'
                sh 'docker push 51.140.99.70:5000/sfia-skilllevel:staging'
		sh '/home/manager/terraform-azure/backEndUpdate.sh'
                 
                } 
            }


      stage('Production') {
	when {
		expression {
			env.BRANCH_NAME=='master'
		}
	}
            steps {
		echo "production"
		sh '. /home/manager/terraform-azure/ansible/ENV_VARIABLES.sh'
                sh 'mvn package -DskipTests'
		sh 'docker build --build-arg PORT_NAME=$SKILLLEVEL_PORT --build-arg PASSWORD=$MONGODB_PASSWORD_SKILLLEVEL -t="51.140.99.70:5000/sfia-skilllevel:production" .'
                sh 'docker push 51.140.99.70:5000/sfia-skilllevel:production'
		sh '/home/manager/terraform-azure/backEndUpdate.sh'
            }
        }
}
}
