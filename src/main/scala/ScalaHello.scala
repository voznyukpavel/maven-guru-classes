object ScalaHello {
  def main(args: Array[String]): Unit = {
    val javaHello = new JavaHelloWorld()
    println(javaHello.getHello())
  }
}