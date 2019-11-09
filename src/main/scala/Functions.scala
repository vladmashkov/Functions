object Main extends App{
  // 1
  def partApply(f: (Int, Int) => Int, x: Int): Int => Int = f (_, x)

  // 2
  def fg (f: (Int) => Double, g: (Double) => String): Int => String = g compose f

  // 3
  def curry (f: (Int, Double) => String): Int => Double => String = f.curried
}