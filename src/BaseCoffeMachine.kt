//Abrir clase
open class BaseCoffeMachine (
    //precio
    private val price:Double,
    //color
    private val color:String
){
    //private=al tener el private no se puede tener acceso a la funcion(datos)
    //private fun makeCoffe(){}

     fun makeCoffe(){
        println("Here is your coffe")
    }


}