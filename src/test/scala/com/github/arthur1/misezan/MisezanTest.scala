package com.github.arthur1.misezan

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class Misezan extends AnyFunSuite with Matchers {
  // The test case descriptions are taken from the following article:
  // https://dic.nicovideo.jp/a/%E8%A6%8B%E3%81%9B%E7%AE%97

  test("同じ数字同士を見せ合うと眼は0になる。（自分と同じ格好の人を見ると気まずくなり2人とも立ち去るため。）") {
    1 mise 1 shouldBe 0
    3 mise 3 shouldBe 0
  }

  test("小さい数字に大きい数字を見せ合うと大きい数字が残る。（小さい数が大きい数を怖がって逃げてしまうため。）") {
    1 mise 2 shouldBe 2
    2 mise 1 shouldBe 2
    3 mise 0 shouldBe 3
  }

  test("6見せ9=11（お互いが生き別れの兄弟と勘違いして近づいていくため。）") {
    6 mise 9 shouldBe 11
    9 mise 6 shouldBe 11
  }

  test("2見せ5=1.1（お互いが生き別れの兄弟と勘違いして近寄るがよく見ると全然違うことに気付きびっくりして携帯「.」を落としてしまうため。）") {
    2 mise 5 shouldBe 1.1
    5 mise 2 shouldBe 1.1
  }

  test("1見せ100=83（あまりにも人数差がありもう逃げても仕方ないと1が腹をくくって100に立ち向かい17人倒すため。）") {
    1 mise 100 shouldBe 83
    100 mise 1 shouldBe 83
  }
}
