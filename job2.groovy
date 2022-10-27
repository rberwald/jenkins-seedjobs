def jobName = "job2"
def gitUrl = "https://github.com/rberwald/jenkins-another-test-pipeline.git"
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
