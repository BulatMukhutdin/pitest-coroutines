package tat.mukhutdinov.pitestcoroutines

class Calculator(private val dependency: Dependency) {

    suspend fun foo() =
        dependency.foo()
}