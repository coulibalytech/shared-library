#!/usr/bin/env groovy

def call(String buildResult){
  if ( buildResult == "SUCCESS"){
      slackSend color: 'good' , message: "CONGRATULATION: job '${env.JOB_NAME} with builnumber ${env.BUILD_NUMBER} was successful ! more info ${env.BUILD_URL}"
  }
  else if ( buildResult == "FAILURE"){
      slackSend color: 'danger' , message: "BAD NEWS: job '${env.JOB_NAME} with builnumber ${env.BUILD_NUMBER} was failed ! more info ${env.BUILD_URL}"
  }
  else if ( buildResult == "UNSTABLE"){
      slackSend color: 'warning' , message: "BAD NEWS: job '${env.JOB_NAME} with builnumber ${env.BUILD_NUMBER} was unstable ! more info ${env.BUILD_URL}"
  }
  else {
      slackSend color: 'danger' , message: "BAD NEWS: job '${env.JOB_NAME} with builnumber ${env.BUILD_NUMBER} its result was unclear ! more info ${env.BUILD_URL}"
  }
}
