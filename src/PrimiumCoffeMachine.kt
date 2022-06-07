//podria tener mas opciones que BaseCoffeMachine
class PrimiumCoffeMachine (
    private val price:Double,
    private val color:String
        ) : BaseCoffeMachine(price ,color){

    override val brand: String
        get() ="Brand XY"

    override fun makeCoffe(type: String): String {
        return "Your $type is Ready"
    }

    override fun machineInfo(): String {
        return super.machineInfo()
    }


}
            /*
            BaseCoffeMachine
            fun makeCapuchino(){
                println("here is your capuccino")
            }
            */
