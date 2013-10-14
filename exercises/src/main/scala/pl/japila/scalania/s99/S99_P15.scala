package pl.japila.scalania.s99

object S99_P15 {
  def duplicateN[T](n: Int, ts: Seq[T]): Seq[T] = ts match {
    case Seq() =>
      Seq[T]()
    case x :: xs =>
      (0 until n toList).map { _ => x } ++ duplicateN(n, xs)
  }
}
