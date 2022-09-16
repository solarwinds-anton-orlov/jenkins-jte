jte {
    allow_scm_jenkinsfile = false
    // pipeline_template = "Jenkinsfile"
}
stages {
    continuous_integration {
        test()
        build()
        publish()
    }
    continuous_delivery {
        deploy()
    }
}
libraries {
    testLibrary
}
