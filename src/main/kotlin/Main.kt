fun main(){
    details("alice")
    var num = numbers(arrayOf(23,34,65,90,45))
    var name = names(arrayOf("alice","Joy","kate"))
//CLASS PART
    var calculator = Calculator(14,15,16,18)
    calculator.add(50,10)
    calculator.sub(50,10)
    calculator.division(50,10)
    calculator.multiplication(50,10)
    //
    println(calculator.Addition)
    println(calculator.Subtraction)
    println(calculator.multiplication)
    println(calculator.division)
}
//number2
fun numbers (num:Array<Int>):Int{
    var num = arrayOf(23,34,65,90,45)
    return num.max()
    return num.min()
    return num.sum()
}
//number4
fun names(name:Array<String>):String{
    var name = arrayOf("alice","joy","kate")
    return name.joinToString { "," }
}
//3
fun details(name:String){
    var naming = name

}
//number5
class Calculator (var multiplication:Int,var Addition:Int,var division:Int,var Subtraction:Int){
    fun add(num1:Int,num2:Int){
        println(num1+num2)
    }
    fun sub (num1:Int,num2:Int){
        println(num1-num2)
    }
    fun division(num1:Int,num2:Int){
        println(num1/num2)
    }
    fun multiplication(num1:Int,num2:Int){
        println(num1*num2)
    }

}