# misezan-scala

[さや香の見せ算](https://www.youtube.com/watch?v=QSfNwVBg3EA)をScala 3で実装したものです。

```scala
scala> import io.github.arthur1.misezan.mise

scala> 1 mise 1
val res0: BigDecimal = 0

scala> 1 mise 2
val res1: BigDecimal = 2

scala> 2 mise 5
val res2: BigDecimal = 1.1

scala> 1 mise 100
val res3: BigDecimal = 83
```

## How to use

### scala-cli

```console
$ cat main.scala
//> using dep "io.github.arthur1::misezan-scala:0.1.0"

import io.github.arthur1.misezan.mise

@main def program =
  println(2 mise 5) // 1.1
$ scala-cli main.scala
1.1
```