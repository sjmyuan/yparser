package com.yparser

object Parser {
  def parse(content: String): Context = IntContext("",content.length)
}
