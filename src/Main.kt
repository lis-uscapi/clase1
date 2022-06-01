import kotlin.math.*

fun main(){
    //Independientes
    //Boolean size 1bit false/true
    //Char size 16bit ('a' to 'z' '/n' '/101')
   /*
   Numbers
    *Byte size 8bit {-127 to 128} (rango que determina 1 bit)
    *Double size 64bit {3.4d}
    *Float size 32bit  (decimales flotantes){3.4f}
    *Int size 32bit (numeros enteros + y -){-2 -1 0 1 2}
    *Long size 64bit {-2L -1L 0L 1L 2L}
    *Short size 16bit none
    */
    //String 'Hola'
    //Array of int [1,2,3]  arreglo de cualquier tipo de numero
    /*
    println("Hola")
    println(42)
    println(3.14)
    println(true)
    println('a')
    */

    //----------------------

//val CONSTANTES
    //no pueden ser alteradas
    //no se puede renombrar el 2 de dayOfBirth(siempre es 2 igual
    // con el 12 monthOfBirth)
//val no puede ser reaccinado a su valor
    //fecha-dia(cumpleaños)
    val dayOfBirth:Int=2;
    //mes
    val monthOfBirth:Int=12
    println("My birthday is $dayOfBirth/$monthOfBirth")
    println("My birthday is: " +dayOfBirth+"/"+monthOfBirth)

    //-------------------

//var VARIABLE
    //pueden ser alteradas
    var name:String="lis"
    var lastName:String ="Ramos"
    println("My name is ${name.uppercase()} ${lastName.lowercase()}")
    println("My name is: " +name+" "+lastName)

     name="liset"
    println("My name is $name $lastName")
    //---------------------------------
    //nunca se reaccina  tipos de datos de las variables
    //si es un arreglo se deja como arreglo
    //si es un Boolean se mantiene como Boolean
    //-----------------------
    //(toUpperCase) uppercase  para volver el texto mayucula
    //(toLowerCase) lowercase PARA volver un texto en minuscula
    //ejem:
    //println("My name is ${name.uppercase()} ${lastName.lowercase()}")

    //---------------------------------
    //Operaciones Matematicas

    //Suma
    println(2+2)
    //Resta
    println(2-2)
    //Division
    println(2/2)
    //Modulos
    println(2%2)
    //Multiplicacion
    println(2*2)
    //Potencia
    println(2.0.pow(2))
    //Operacio Matematica
    println(((2+2)/2)*2)
    println(1+(9/3)*2)

    //----------------------------------
    //Comparacion e igualdad operadores
    //igualdad
    println(2 == 2)//retorna un Boolean
    //desigualdad/diferencia
    println(2 != 2)
    //mayor que
    println(2 > 2)
    //menor que
    println(2 < 2)
    //mayor o igual que
    println(2 >= 2)
    //menor o igual que
    println(2 <= 2)

    //--------------------
    //Operadores de aignacion

    //se crea el numero 0
    var anyNumber:Int=0

    anyNumber +=10//al valor le sumo 10
    anyNumber -=2//al valor le resto 2
    anyNumber *=2
    anyNumber /=2
    anyNumber %=2//le saco el modulo 2

    //incrementadores y decrementadores
    anyNumber++//le sumo 1 (incrementadores)
    anyNumber--//le resto 1 (decrementadores)
    println(anyNumber)

//----------------------------

    var isTrue:Boolean=true
    var isFalse:Boolean=false
    //operadores logicoS
    //AND (&&)
    println(isTrue && isFalse)

    //OR (||)
    println(isTrue || isFalse)

    //NOT(invierte una afirmacion)
    println(!isTrue)


//--------------------------------------------------
    //LLAMO LA FUNCION PARA EJECUTAR helloWorld(se puede ejecutar n veces)
    //se puede llamar las veces que uno quiera
    helloWorld()
    //---------
    //el doble de ese numero

    //*ejem1
    // dobletheValue(2)

    //*ejem(2)
        //la funcion "dobletheValue" retorna un numero
        //y ese numero se guarda en una variable que es un entero
        //porque entra un entero en la funcion y sale un entero
    var myNumber:Int = dobletheValue(2)
    println(myNumber)

    //----------
    //*1
    favoriteFoodPrompt("Daniel","Sushi")

    //*2
    favoriteFoodPrompt()
}

//CREO UNA NUEVA FUNCION
fun helloWorld(){
    println("Hello World")
}

//el doble de ese numero(devuelve un numero entero)
fun dobletheValue(numberValue: Int):Int{
    return numberValue*2
}

    //*2
//valor por defecto a una funcion
    fun favoriteFoodPrompt(name:String="Anonymous",favoriteFood:String="Pizza"){
    //*1
    //fun favoriteFoodPrompt(name:String,favoriteFood:String){
    println("$name's favorite food is $favoriteFood")

}