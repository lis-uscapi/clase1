class Box constructor(
//constructor
    var lenght:Int=0,
    var width:Int=0,
    var height:Int=0,

){

    init {
        println("Box is created")
    }
    constructor():this(0,0,0){
        println("Secondary constructor called")
    }
//-------------------
//constructor(color:String="blue"):this(0,0,0)
    //iguales  / \
    //var lenght:Int=0,
    //    var width:Int=0,
    //    var height:Int=0,
    //    -----------------

    /*
    //protected
    //internal parte del mismo modulo si solo es uno es publico
    //metodo getter por que esta denttro de la variable
    val lenght:Int=8
    val width:Int=6//ancho
    val height:Int=5//alto
    */
    val volume get() = lenght*width*height


    var boxName:String ="Box Name"//variable para el
    set(value){ //SET es un metodo prte de la clase
        //si la longitud de la caja es menor a 3
        if(value.length < 3){
            println("Box name must be at least 3 characters long")
        }else{//si no el campo debe ser igual al valor
            field=value
        }

    }

    //se tiene una caja
    fun fillContents(){
        println("Filling the box.....")
    }
    //se abrio la caja
    fun open(){
        println("Opening the box....")
    }
}