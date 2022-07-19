object answer7 {
def main(args:Array[String]){

val codes = Seq("A", "BB", "CCC", "DDDD", "EEEEE")
 val codesWithLength = codes.map { code =>
   s"$code - ${code.length}"
 }

 codesWithLength.foreach(println(_))

