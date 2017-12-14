object Exercise6 {
  def longestWord(input: String): String = input.split(" ").maxBy(str => str.length)

  def mostCommonWord(input: String): String = input.split(" ").groupBy(str => str).maxBy(map => map._2.length)._1

  def mostCommonLetter(input: String): Char = input.split(" ").flatMap(str => str.toCharArray).groupBy(c => c).maxBy(elem => elem._2.length)._1

  def createMapLetterToWord(input: String): Map[Char, List[String]] = input.split(" ")
    .flatMap(str => str.toCharArray.map(c => (c, str)))
    .groupBy(c => c._1)
    .mapValues(m => m.map(p => p._2).distinct.toList)
}
