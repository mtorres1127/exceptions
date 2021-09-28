// Exception Handling in Scala

// Imports
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

// Main Object
object Exp {
def main(args: Array[String]){
    try{
        // ArithmeticException: / by zero
        // val x = 1/0
        // FileNotFoundException
        // val file = new FileReader("file.txt")
        // ArrayIndexOutOfBoundsException
        val arr = Array(0,0,0)
        val x = arr(5)
    }
    catch{
        case ex1: ArithmeticException =>{
            println("Division by zero has occured!")
            }
        case ex2: FileNotFoundException =>{
            println("File could not be located!")
        }
        case ex3: ArrayIndexOutOfBoundsException=>{
            println("Index is not in array!")
        }
    }
    finally{
        println("This code executes no matter what!")
    }
}
}