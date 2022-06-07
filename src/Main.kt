//clase de BaseCoffeMachine
fun main() {

    //val coffeMachine=BaseCoffeMachine(10000.0,"Brown")
    val coffeMachine=PrimiumCoffeMachine(10000.0,"Brown")
    val info=coffeMachine.machineInfo();
    val coffe=coffeMachine.makeCoffe("CAPUCCINO");
    println(coffe)
    println(info)


    //se sirve cafe
    //coffeMachine.makeCoffe();


}