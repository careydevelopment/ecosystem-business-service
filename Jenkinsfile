node {
	def app
	def image = 'careydevelopment/ecosystem-business-service'
	def branch = scm.branches[0].name.substring(2)
	
	try {
	   stage('Cleanup') {
            sh 'sudo docker rm --force ecosystem-business-service || true'
            sh 'sudo docker rmi --force ecosystem-business-service || true'
        }
        
		stage('Clone repository') {
	    	git branch: branch,
	        	credentialsId: 'GitHub Credentials',
	        	url: 'https://github.com/careydevelopment/ecosystem-business-service.git'
	    } 
	
	    stage('Copy properties files') {
           sh 'cp ../config/ecosystem-business-service/application.properties ./src/main/resources'
        } 
	
		stage('Build JAR') {
	    	docker.image('maven:3.6.3-jdk-11').inside('-v /root/.m2:/root/.m2') {
	        	sh 'mvn -B -Dmaven.test.skip=true clean package'
	        	stash includes: '**/target/ecosystem-business-service.jar', name: 'jar'
	    	}
	    }
	     
	    stage('Build Image') {
	    	unstash 'jar'
			app = docker.build image
	    }
	    
	    stage ('Docker Run') {
            sh 'docker run -d -t -p 37120:37120 -v /etc/careydevelopment:/etc/careydevelopment --name ecosystem-business-service careydevelopment/ecosystem-business-service:latest'
        }
	} catch (e) {
		echo 'Error occurred during build process!'
		echo e.toString()
		currentBuild.result = 'FAILURE'
	} finally {
		//skipping tests as we need environment setup (e.g., remote properties files)
		//will get to it later
        //junit '**/target/surefire-reports/TEST-*.xml'		
	}
}