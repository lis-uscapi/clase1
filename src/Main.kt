data class Person(
    /*
    val id:String,
    val name:String,
    val country:String
*/
    val id:String,
    val fistName:String,
    val lastName: String,
    val country:String
){
    fun getName()="$fistName $lastName"
}

fun main() {

 //val person=Person("1","Daniel","Peru")
 //val person1=Person("1","Pepito","India")
 //println(person)//(solo 1)
   // println(person==person1)//false


    //val person=Person("1","Daniel","Peru")
    //val person1=Person("1","Pepito","Peru")
    //println(person)//(solo 1)
    // println(person==person1)//true

    val person=Person("1","Daniel","Soto","Peru")
    val person1=Person("1","Daniel","Soto","Peru")
    println(person==person1)
    println(person.getName())

    //instanciar n veces
    //componenteN
    /*
    println(person.component1())
    println(person.component2())
    println(person.component3())
    println(person.component4())*/
//se obtiene cada uno de los valores que estan dentro de la personas
//lo que se obtiene de la clase

/////////////////////////===========
    val (id,fistName,lastName,country)=person//destructurar(descructuring)
    //destructuring declaration
    println("$id $fistName $lastName $country")

    //para objetos grandes
}