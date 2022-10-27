def jobName = "job1"
def gitUrl = "https://github.com/rberwald/jenkins-test-pipeline.git"
def branches = "*/main"

pipelineJob("${jobName}") {
definition {
    cpsScm {
        scm {
            git{
              remote {
                url("${gitUrl}")
              }
              branch("${branches}")
            }
        }
    }
  }
}
