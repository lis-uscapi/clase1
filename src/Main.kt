//clase de BaseCoffeMachine
fun main() {

    //val coffeMachine=BaseCoffeMachine(10000.0,"Brown")
    val coffeMachine=PrimiumCoffeMachine(10000.0,"Brown")
    val info=coffeMachine.machineInfo();
    val coffe=coffeMachine.makeCoffe("CAPUCCINO");
    println(coffe)
    println(info)

    val simpleCoffeeMachine=CoffeeMachine(2000.0,"Black")
    val coffe2=simpleCoffeeMachine.makeCoffe("Expresso")
    println(coffe2)

    //se sirve cafe
    //coffeMachine.makeCoffe();


}