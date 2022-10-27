def githubUrl = "https://github.com/rberwald/jenkins-test-pipeline.git"

pipelineJob("Seed job1") {
definition {
    cpsScm {
        scm {
            git{
              remote {
                url("${githubUrl}")
              }
              branch("*/main")
            }
        }
    }
  }
}
