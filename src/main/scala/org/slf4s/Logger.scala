package org.slf4s

import org.slf4j.{Logger => Underlying, Marker}

class Logger(val underlying: Underlying) {
  def trace(msg: String): Unit = macro LoggerMacro.trace
  def trace(msg: String, t: Throwable): Unit = macro LoggerMacro.traceT
  def trace(marker: Marker, msg: String): Unit = macro LoggerMacro.traceM
  def trace(marker: Marker, msg: String, t: Throwable): Unit = macro LoggerMacro.traceMT
  def trace(markerOpt: Option[Marker], msg: String): Unit = macro LoggerMacro.traceOM
  def trace(markerOpt: Option[Marker], msg: String, t: Throwable): Unit = macro LoggerMacro.traceOMT
  def debug(msg: String): Unit = macro LoggerMacro.debug
  def debug(msg: String, t: Throwable): Unit = macro LoggerMacro.debugT
  def debug(marker: Marker, msg: String): Unit = macro LoggerMacro.debugM
  def debug(marker: Marker, msg: String, t: Throwable): Unit = macro LoggerMacro.debugMT
  def debug(markerOpt: Option[Marker], msg: String): Unit = macro LoggerMacro.debugOM
  def debug(markerOpt: Option[Marker], msg: String, t: Throwable): Unit = macro LoggerMacro.debugOMT
  def info(msg: String): Unit = macro LoggerMacro.info
  def info(msg: String, t: Throwable): Unit = macro LoggerMacro.infoT
  def info(marker: Marker, msg: String): Unit = macro LoggerMacro.infoM
  def info(marker: Marker, msg: String, t: Throwable): Unit = macro LoggerMacro.infoMT
  def info(markerOpt: Option[Marker], msg: String): Unit = macro LoggerMacro.infoOM
  def info(markerOpt: Option[Marker], msg: String, t: Throwable): Unit = macro LoggerMacro.infoOMT
  def warn(msg: String): Unit = macro LoggerMacro.warn
  def warn(msg: String, t: Throwable): Unit = macro LoggerMacro.warnT
  def warn(marker: Marker, msg: String): Unit = macro LoggerMacro.warnM
  def warn(marker: Marker, msg: String, t: Throwable): Unit = macro LoggerMacro.warnMT
  def warn(markerOpt: Option[Marker], msg: String): Unit = macro LoggerMacro.warnOM
  def warn(markerOpt: Option[Marker], msg: String, t: Throwable): Unit = macro LoggerMacro.warnOMT
  def error(msg: String): Unit = macro LoggerMacro.error
  def error(msg: String, t: Throwable): Unit = macro LoggerMacro.errorT
  def error(marker: Marker, msg: String): Unit = macro LoggerMacro.errorM
  def error(marker: Marker, msg: String, t: Throwable): Unit = macro LoggerMacro.errorMT
  def error(markerOpt: Option[Marker], msg: String): Unit = macro LoggerMacro.errorOM
  def error(markerOpt: Option[Marker], msg: String, t: Throwable): Unit = macro LoggerMacro.errorOMT
}

object Logger {
  def apply(underlying: Underlying): Logger = new Logger(underlying)
}
