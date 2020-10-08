package org.slf4s

import scala.reflect.macros.blackbox.Context
import org.slf4j.Marker

private object LoggerMacro {
  def trace(c: Context { type PrefixType = Logger })(msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isTraceEnabled) $underlying.trace($msg)"
  }

  def traceT(c: Context { type PrefixType = Logger })(msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isTraceEnabled) $underlying.trace($msg, $t)"
  }

  def traceM(c: Context { type PrefixType = Logger })(marker: c.Expr[Marker], msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isTraceEnabled($marker)) $underlying.trace($marker, $msg)"
  }

  def traceMT(c: Context { type PrefixType = Logger })(marker: c.Expr[Marker], msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isTraceEnabled($marker)) $underlying.trace($marker, $msg, $t)"
  }

  def traceOM(c: Context { type PrefixType = Logger })(markerOpt: c.Expr[Option[Marker]], msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"""if ($markerOpt.isDefined) {
          if ($underlying.isTraceEnabled($markerOpt.get)) $underlying.trace($markerOpt.get, $msg)
        } else {
          if ($underlying.isTraceEnabled) $underlying.trace($msg)
        }
    """
  }

  def traceOMT(c: Context { type PrefixType = Logger })(markerOpt: c.Expr[Option[Marker]], msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"""if ($markerOpt.isDefined) {
          if ($underlying.isTraceEnabled($markerOpt.get)) $underlying.trace($markerOpt.get, $msg, $t)
        } else {
          if ($underlying.isTraceEnabled) $underlying.trace($msg, $t)
        }
    """
  }

  def debug(c: Context { type PrefixType = Logger })(msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isDebugEnabled) $underlying.debug($msg)"
  }

  def debugT(c: Context { type PrefixType = Logger })(msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isDebugEnabled) $underlying.debug($msg, $t)"
  }

  def debugM(c: Context { type PrefixType = Logger })(marker: c.Expr[Marker], msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isDebugEnabled($marker)) $underlying.debug($marker, $msg)"
  }

  def debugMT(c: Context { type PrefixType = Logger })(marker: c.Expr[Marker], msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isDebugEnabled($marker)) $underlying.debug($marker, $msg, $t)"
  }

  def debugOM(c: Context { type PrefixType = Logger })(markerOpt: c.Expr[Option[Marker]], msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"""if ($markerOpt.isDefined) {
          if ($underlying.isDebugEnabled($markerOpt.get)) $underlying.debug($markerOpt.get, $msg)
        } else {
          if ($underlying.isDebugEnabled) $underlying.debug($msg)
        }
    """
  }

  def debugOMT(c: Context { type PrefixType = Logger })(markerOpt: c.Expr[Option[Marker]], msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"""if ($markerOpt.isDefined) {
          if ($underlying.isDebugEnabled($markerOpt.get)) $underlying.debug($markerOpt.get, $msg, $t)
        } else {
          if ($underlying.isDebugEnabled) $underlying.debug($msg, $t)
        }
    """
  }

  def info(c: Context { type PrefixType = Logger })(msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isInfoEnabled) $underlying.info($msg)"
  }

  def infoT(c: Context { type PrefixType = Logger })(msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isInfoEnabled) $underlying.info($msg, $t)"
  }

  def infoM(c: Context { type PrefixType = Logger })(marker: c.Expr[Marker], msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isInfoEnabled($marker)) $underlying.info($marker, $msg)"
  }

  def infoMT(c: Context { type PrefixType = Logger })(marker: c.Expr[Marker], msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isInfoEnabled($marker)) $underlying.info($marker, $msg, $t)"
  }

  def infoOM(c: Context { type PrefixType = Logger })(markerOpt: c.Expr[Option[Marker]], msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"""if ($markerOpt.isDefined) {
          if ($underlying.isInfoEnabled($markerOpt.get)) $underlying.info($markerOpt.get, $msg)
        } else {
          if ($underlying.isInfoEnabled) $underlying.info($msg)
        }
    """
  }

  def infoOMT(c: Context { type PrefixType = Logger })(markerOpt: c.Expr[Option[Marker]], msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"""if ($markerOpt.isDefined) {
          if ($underlying.isInfoEnabled($markerOpt.get)) $underlying.info($markerOpt.get, $msg, $t)
        } else {
          if ($underlying.isInfoEnabled) $underlying.info($msg, $t)
        }
    """
  }

  def warn(c: Context { type PrefixType = Logger })(msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isWarnEnabled) $underlying.warn($msg)"
  }

  def warnT(c: Context { type PrefixType = Logger })(msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isWarnEnabled) $underlying.warn($msg, $t)"
  }

  def warnM(c: Context { type PrefixType = Logger })(marker: c.Expr[Marker], msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isWarnEnabled($marker)) $underlying.warn($marker, $msg)"
  }

  def warnMT(c: Context { type PrefixType = Logger })(marker: c.Expr[Marker], msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isWarnEnabled($marker)) $underlying.warn($marker, $msg, $t)"
  }

  def warnOM(c: Context { type PrefixType = Logger })(markerOpt: c.Expr[Option[Marker]], msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"""if ($markerOpt.isDefined) {
          if ($underlying.isWarnEnabled($markerOpt.get)) $underlying.warn($markerOpt.get, $msg)
        } else {
          if ($underlying.isWarnEnabled) $underlying.warn($msg)
        }
    """
  }

  def warnOMT(c: Context { type PrefixType = Logger })(markerOpt: c.Expr[Option[Marker]], msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"""if ($markerOpt.isDefined) {
          if ($underlying.isWarnEnabled($markerOpt.get)) $underlying.warn($markerOpt.get, $msg, $t)
        } else {
          if ($underlying.isWarnEnabled) $underlying.warn($msg, $t)
        }
    """
  }
  
  def error(c: Context { type PrefixType = Logger })(msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isErrorEnabled) $underlying.error($msg)"
  }

  def errorT(c: Context { type PrefixType = Logger })(msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isErrorEnabled) $underlying.error($msg, $t)"
  }

  def errorM(c: Context { type PrefixType = Logger })(marker: c.Expr[Marker], msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isErrorEnabled($marker)) $underlying.error($marker, $msg)"
  }

  def errorMT(c: Context { type PrefixType = Logger })(marker: c.Expr[Marker], msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"if ($underlying.isErrorEnabled($marker)) $underlying.error($marker, $msg, $t)"
  }

  def errorOM(c: Context { type PrefixType = Logger })(markerOpt: c.Expr[Option[Marker]], msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"""if ($markerOpt.isDefined) {
          if ($underlying.isErrorEnabled($markerOpt.get)) $underlying.error($markerOpt.get, $msg)
        } else {
          if ($underlying.isErrorEnabled) $underlying.error($msg)
        }
    """
  }

  def errorOMT(c: Context { type PrefixType = Logger })(markerOpt: c.Expr[Option[Marker]], msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val underlying = q"${c.prefix}.underlying"
    q"""if ($markerOpt.isDefined) {
          if ($underlying.isErrorEnabled($markerOpt.get)) $underlying.error($markerOpt.get, $msg, $t)
        } else {
          if ($underlying.isErrorEnabled) $underlying.error($msg, $t)
        }
    """
  }
}
