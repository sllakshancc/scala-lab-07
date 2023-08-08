def calculateSquare(numbers: List[Int]): List[Int] = {
  numbers.map(n => n * n)
}


@main def main() = {
    val numbers = List(1, 2, 3, 4, 5)
    val squares = calculateSquare(numbers)
    println(squares)
}