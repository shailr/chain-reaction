package org.shail.chainreaction.models

/**
 * Created by shail on 05-09-2015.
 */
class Cell(val c: Int, val col:Int, val lim:Int) {

  private var _count : Int = c
  private var _color : Int = col
  private var _limit : Int = lim

  def this() = {
    this(0, -1, 1)
  }

  def this(limit: Int){
    this(0, -1, limit)
  }

  def this(c : Cell) = {
    this(c._count, c._color, c._limit)
  }

  def count = _count
  def color = _color
  def limit = _limit

  def color_= (col: Int): Unit = _count = col

  def isStable = () => limit!=count

  def raiseCount = (col: Int) => {color = col; _count = _count + 1}

  def clearCell = () => {color = -1; _count = 0}

}