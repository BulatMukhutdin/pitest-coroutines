package tat.mukhutdinov.pitestcoroutines

class DependencyImpl : Dependency {

    override suspend fun foo() {
        println("Do nothing")
    }
}