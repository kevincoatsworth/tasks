import scala.io.StdIn

object RemoveSpaces extends App {

  def removeWhiteSpaces(word : String) = {

    word.replaceAll(" ","")

  }

  val userString = StdIn.readLine("Please enter a String: ")

  println(removeWhiteSpaces(userString))

}
