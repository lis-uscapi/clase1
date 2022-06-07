//Abrir clase :open class BaseCoffeMachine
//abstraer la clase
abstract class BaseCoffeMachine (
    //precio
    private val price:Double,
    //color
    private val color:String
){
    abstract val brand:String
    abstract fun makeCoffe(type:String):String

//    aperturar
     fun machineInfo():String{
        return "coffe Machine Details:\n" +
                "Brand: $brand\n" +
                "Color: $color\n" +
                "Price: $price\n"
    }

}

    //private=al tener el private no se puede tener acceso a la funcion(datos)
    //private fun makeCoffe(){}
        /*
        PrimiumCoffeMachine
             fun makeCoffe(){
                println("Here is your coffe")
            }
        */

