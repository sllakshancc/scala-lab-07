def filterEvenNumbers(numbers: List[Int]): List[Int] = {
  numbers.filter(_ % 2 == 0) // shorter version of (item => item % 2 == 0)
}


@main def main() = {
    val num = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNum = filterEvenNumbers(num)
    println(evenNum)
}