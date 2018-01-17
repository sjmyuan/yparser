package com.yparser

trait Parser[T] {
  def at(content: String): Context
}
