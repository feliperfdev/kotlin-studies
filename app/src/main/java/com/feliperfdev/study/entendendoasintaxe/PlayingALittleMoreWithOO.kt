package com.feliperfdev.study.entendendoasintaxe

data class User(val id: Int, val name: String)

interface GetUserState

class GetUserInitialState : GetUserState
class GetUserLoadingState(val isLoading: Boolean) : GetUserState
class GetUserSuccessState(val user: User) : GetUserState
class GetUserErrorState(val message: String) : GetUserState

fun showStateString(state: GetUserState) {
    println("$state - ${state.hashCode()}")

    if (state is GetUserSuccessState) {
        println("${state.user.id} — ${state.user.name}")
    }

    if (state is GetUserLoadingState) {
        // In Kotlin it`s recommended not to use the 'ternary' expression ? :
        // but the if else `inline`:
        println(if (state.isLoading) "Is loading" else "Is not loading")
    }

    if (state is GetUserErrorState) {
        println(state.message)
    }
}

fun showStateStringWithWhen(state: GetUserState) {
    println("$state - ${state.hashCode()}")

    println(
        when (state) {
            is GetUserSuccessState -> "${state.user.id} — ${state.user.name}"
            is GetUserErrorState -> state.message
            is GetUserLoadingState -> if (state.isLoading) "Is loading" else "Is not loading"
            is GetUserInitialState -> ""
            else -> ""
        }
    )
}

fun main() {

    val user = User(1, "Felipe")

    showStateString(GetUserInitialState())
    showStateString(GetUserLoadingState(true))
    showStateString(GetUserSuccessState(user))
    showStateString(GetUserErrorState("Test"))

    println()
    println()

    val user2 = User(1, "Kotori")

    showStateStringWithWhen(GetUserInitialState())
    showStateStringWithWhen(GetUserLoadingState(false))
    showStateStringWithWhen(GetUserSuccessState(user2))
    showStateStringWithWhen(GetUserErrorState("Test 2"))

}