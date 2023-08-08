def isPrime(n: Int): Boolean = {
  if (n <= 1) false
  else if (n == 2) true
  else !(2 until n).exists(x => n % x == 0)
}

def filterPrime(list: List[Int]): List[Int] = {
  list.filter(item=> isPrime(item))
}

@main def main() = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primes = filterPrime(numbers)
    println(primes)
}