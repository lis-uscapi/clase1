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
    //val no puede ser reaccionado a su valor
    //val CONSTANTES
    //no pueden ser alteradas
    //no se puede renombrar el 2 de dayOfBirth(siempre es 2 igual
    // con el 12 monthOfBirth)

    //fecha-dia(cumpleaños)
    val dayOfBirth:Int=2;
    //mes
    val monthOfBirth:Int=12
    println("My birthday is $dayOfBirth/$monthOfBirth")
    println("My birthday is: " +dayOfBirth+"/"+monthOfBirth)

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


}