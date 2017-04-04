#!groovy
multibranchPipelineJob('example') {
    
   branchSources {
        git {
            remote('https://github.com/Tejeshwarraju/Powershellrepo.git')
            credentialsId('')
            includes('*')
        }
    }
   orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
    
}
