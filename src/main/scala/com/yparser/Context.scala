package com.yparser

trait Context

case class ObjectContext(name: String, props: List[Context]) extends Context
case class StringContext(name: String, value: String) extends Context
case class BooleanContext(name: String, value: Boolean) extends Context
case class IntContext(name: String, value: Int) extends Context
case class ArrayContext(name: String, values: List[Context]) extends Context
