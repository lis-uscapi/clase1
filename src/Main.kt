//clase de BaseCoffeMachine
fun main() {

    //val coffeMachine=BaseCoffeMachine(10000.0,"Brown")
    val coffeMachine=PrimiumCoffeMachine(10000.0,"Brown")

    //se sirve cafe
    coffeMachine.makeCoffe();
    coffeMachine.makeCapuchino();

}