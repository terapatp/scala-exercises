object Exercise7 {
  def convertStringToChar(input: List[String]): List[Char] = input.flatMap(str => str.toCharArray).distinct
}
