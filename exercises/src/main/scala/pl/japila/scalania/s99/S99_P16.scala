package pl.japila.scalania.s99

object S99_P16 {
  def drop[T](n: Int, ts: Seq[T]): Seq[T] = {
    def dropNth(n: Int, ts: Seq[T], current: Int): Seq[T] = ts match {
      case Seq() =>
        Seq[T]()
      case x :: xs =>
        if (current == 3)
          dropNth(n, xs, 1)
        else
          x +: dropNth(n, xs, current + 1)
    }
    dropNth(n, ts, 1)
  }
}
