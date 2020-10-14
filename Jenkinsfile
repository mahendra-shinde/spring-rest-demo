pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        git 'https://github.com/mahendra-shinde/spring-rest-demo'
        tool(name: 'm3', type: 'build')
      }
    }

  }
}