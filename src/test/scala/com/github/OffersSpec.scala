package com.github

import org.specs2.mutable.Specification

class OffersSpec extends Specification {

  "2 items should cost 0.60 when price for 1 is 0.60, on buyOneGetOne offer" in {
    Offers.buyOneGetOne(2 , 0.60) must be equalTo 0.60
  }

  "3 items should cost 1.20 when price for 1 is 0.60, on buyOneGetOne offer" in {
    Offers.buyOneGetOne(3 , 0.60) must be equalTo 1.20
  }

  "4 items should cost 1.20 when price for 1 is 0.60, on buyOneGetOne offer" in {
    Offers.buyOneGetOne(3 , 0.60) must be equalTo 1.20
  }

  "3 items should cost 0.50 when price for 1 is 0.25, on threeForTwo offer" in {
    Offers.threeForTwo(3, 0.25) must be equalTo 0.50
  }

  "7 items should cost 1.25 when price for 1 is 0.25, on threeForTwo offer" in {
    Offers.threeForTwo(7, 0.25) must be equalTo 1.25
  }

  "Apple has buyOneGetOne offer" in {
    Offers.offer("apple")(2) must be equalTo ShoppingCart.getPrice("apple")
  }

  "Orange has threeForTwo offer" in {
    Offers.offer("orange")(3) must be equalTo (2 * ShoppingCart.getPrice("orange"))
  }
}
