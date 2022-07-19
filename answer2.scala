object answer2 {
def main(args:Array[String]){
val donutName = "Vanilla Donut"
  val quantityPurchased = 10
  val price = 2.50
  val donutJson =
"""|{
|"donut_name":$donutName",
|"quantity_purchased":"$quantityPurchased",
|"price":$price
|}
println(donutJson)
}
}
