package pl.japila.scalania.s99

object S99_P14 {
  def duplicate[T](as: Seq[T]): Seq[T] = as match {
    case Seq() =>
      Seq[T]()
    case x :: xs =>
      x +: x +: duplicate(xs)
  }
}
