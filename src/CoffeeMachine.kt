class CoffeeMachine(
    price:Double,
    color:String,
        ):BaseCoffeMachine(price, color) {
    override val brand: String
        get() = "Bran Y"

    override fun makeCoffe(type: String): String {
        Thread.sleep(3500)
        return "Your $type is Ready!"
    }
}