package screen

object ScreenStack {
    private val screenStack = mutableListOf<Screen>()

    fun push(screen: Screen) {
        screenStack.add(screen)
    }

    fun pop(): Screen? {
        val elem = screenStack.lastOrNull()
        screenStack.removeLastOrNull()

        return elem
    }

    fun peek(): Screen? {
        return screenStack.lastOrNull()
    }
}

sealed class Screen
