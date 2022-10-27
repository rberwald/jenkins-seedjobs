def githubUrl = "https://github.com/rberwald/jenkins-another-test-pipeline.git"

pipelineJob("Seed job2") {
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
