fun main() {
number()
   println( names( arrayOf("gloria","apui","lado")))
soda(4)
    soda(8)
    soda(18)
    fizz()
}

fun   number(){
    var x = 1..100
for (x in x){
    if (  x%2!=0){
        println(x)


    }    }
}

fun names(name:Array<String>):Int {
    var result = 0
    for (x in name) {
        if (x.length > 5) {
            result++
        }
    }
    return result
}

 fun soda(age:Int){
     when(age){
         in 0..5 -> println("milk")
         in 7..14 -> println("fanta orange")
         else-> println("cocacola")
     }

}
fun fizz(){

    for (num in 1..100)
        when{
            num % 3==0 && num % 5==0 -> println("FizzBuzz")
            num% 3==0-> println("Fizz")
            num%5==0-> println("Buzz")
            else -> println(num)

        }




}