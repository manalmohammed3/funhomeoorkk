fun main(args: Array<String>) {
    var manalMohammed= "kotlin"
    println(manalMohammed)

         println(
{///////////lambda////////
    var twaiqAcademy =2021
    "study hard $manalMohammed the kotlin programming need more practice" +
            " ($twaiqAcademy)" }
)

////////////anonymous function
    val goodMorning: ()-> String ={
       val menu= "cofee"
       "$menu is  $manalMohammed's best selection "

    }
    println(goodMorning)

  ////////////add parameter
   val goodMorning:(String)-> String ={menu ->

     "$menu is  $manalMohammed's best selection "
 }
println(goodMorning("cofee"))
    