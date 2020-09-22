data class Reciple(val title: String,
                   val mainIngredient: String,
                   val isVegetarian: Boolean = false,
                   val difficulty: String = "Easy"){

    override fun toString(): String {
        return "overraide"
    }

}