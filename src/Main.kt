import kotlin.math.*

fun main() {

    //val box1=Box();
    val box1 = Box(5, 15, 6);

    val box2 = Box();


///////////

    println("Height: ${box1.height}");
    println("Width: ${box1.width}");
    println("Length: ${box1.lenght}");
    println("Volume: ${box1.volume}");
   // box1.boxName="Shoes box";
    box1.boxName="Sh";//{debe de tener al menos 3 caracteres
    println("Box name: ${box1.boxName}");
    box1.open();//mensaje:abre caja
    box1.fillContents();//mensaje:lleno la caja

/*
////////

    val prod1=Product();
    println("producto: ${prod1.name}")
    println("precio: ${prod1.price}")
    println("cantidad: ${prod1.amount}")
 */

}