//podria tener mas opciones que BaseCoffeMachine
class PrimiumCoffeMachine (
    private val price:Double,
    private val color:String
        ) : BaseCoffeMachine(price ,color){

            fun makeCapuchino(){
                println("here is your capuccino")
            }
}