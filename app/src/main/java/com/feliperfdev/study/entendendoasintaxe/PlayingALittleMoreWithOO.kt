package com.feliperfdev.study.entendendoasintaxe

data class User(val id: Int, val name: String)

interface GetUserState

class GetUserInitialState : GetUserState
class GetUserLoadingState : GetUserState
class GetUserSuccessState(val user: User) : GetUserState
class GetUserErrorState(val message: String) : GetUserState

fun showStateString(state: GetUserState) {
    println("$state - ${state.hashCode()}")

    if (state is GetUserSuccessState) {
        println("${state.user.id} — ${state.user.name}")
    }
    if (state is GetUserErrorState) {
        println(state.message)
    }
}

fun main() {

    val user = User(1, "Felipe")

    showStateString(GetUserInitialState())
    showStateString(GetUserLoadingState())
    showStateString(GetUserSuccessState(user))
    showStateString(GetUserErrorState("Test"))

}