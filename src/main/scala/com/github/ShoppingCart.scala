package com.github

import scala.math.BigDecimal.RoundingMode

object ShoppingCart {

  private val priceList: Map[String, Double] = Map(("apple", 0.60), ("orange", 0.25))

  def checkout(items: Array[String]): BigDecimal = {
    val total = items.flatMap(price).sum
    BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN)
  }

  def getPrice(item: String): Double = {
    priceList.getOrElse(item toLowerCase(), 0)
  }

  def price(item: String): Option[Double] = priceList.get(item toLowerCase)
}