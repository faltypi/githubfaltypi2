job ('nodejs job')
{
    scm{
        git('https://github.com/faltypi/githubfaltypi2.git'){ node ->
            node / gitConfigName('DSL script')
            node / gitConfigEmail('jenkins@fakeemail.com')

        }
    }

    triggers {
        scm('H/5 * * * *')

    }

    wrappers{
        nodejs('nodejs')
    }

    steps{
        shell('node app.js')
    }

}