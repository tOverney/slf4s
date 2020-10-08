package org.slf4s

import java.util

import org.scalatest.WordSpec
import org.slf4j.Marker
import org.slf4j.helpers.{BasicMarker, BasicMarkerFactory}

class LoggingWithMarkerExampleSpec extends WordSpec with Logging {
  "Trace logging with a marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    log.trace(marker, "I log, therefore I am")
  }

  "Trace logging an exception with a marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    val exception = new RuntimeException("foo")
    log.trace(marker, "I log, therefore I am", exception)
  }

  "Trace logging with an optional  marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    log.trace(Some(marker), "I log, therefore I am")
    log.trace(None: Option[Marker], "I log, therefore I am")
  }
  
  "Trace logging an exception with an optional marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    val exception = new RuntimeException("foo")
    log.trace(Some(marker), "I log, therefore I am", exception)
    log.trace(None: Option[Marker], "I log, therefore I am", exception)
  }

  "Debug logging with a marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    log.debug(marker, "I log, therefore I am")
  }

  "Debug logging an exception with a marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    val exception = new RuntimeException("foo")
    log.debug(marker, "I log, therefore I am", exception)
  }

  "Debug logging with an optional  marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    log.debug(Some(marker), "I log, therefore I am")
    log.debug(None: Option[Marker], "I log, therefore I am")
  }

  "Debug logging an exception with an optional marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    val exception = new RuntimeException("foo")
    log.debug(Some(marker), "I log, therefore I am", exception)
    log.debug(None: Option[Marker], "I log, therefore I am", exception)
  }

  "Info logging with a marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    log.info(marker, "I log, therefore I am")
  }

  "Info logging an exception with a marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    val exception = new RuntimeException("foo")
    log.info(marker, "I log, therefore I am", exception)
  }

  "Info logging with an optional  marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    log.info(Some(marker), "I log, therefore I am")
    log.info(None: Option[Marker], "I log, therefore I am")
  }

  "Info logging an exception with an optional marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    val exception = new RuntimeException("foo")
    log.info(Some(marker), "I log, therefore I am", exception)
    log.info(None: Option[Marker], "I log, therefore I am", exception)
  }

  "Warn logging with a marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    log.warn(marker, "I log, therefore I am")
  }

  "Warn logging an exception with a marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    val exception = new RuntimeException("foo")
    log.warn(marker, "I log, therefore I am", exception)
  }

  "Warn logging with an optional  marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    log.warn(Some(marker), "I log, therefore I am")
    log.warn(None: Option[Marker], "I log, therefore I am")
  }

  "Warn logging an exception with an optional marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    val exception = new RuntimeException("foo")
    log.warn(Some(marker), "I log, therefore I am", exception)
    log.warn(None: Option[Marker], "I log, therefore I am", exception)
  }

  "Error logging with a marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    log.error(marker, "I log, therefore I am")
  }

  "Error logging an exception with a marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    val exception = new RuntimeException("foo")
    log.error(marker, "I log, therefore I am", exception)
  }

  "Error logging with an optional  marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    log.error(Some(marker), "I log, therefore I am")
    log.error(None: Option[Marker], "I log, therefore I am")
  }

  "Error logging an exception with an optional marker should work" in {
    val marker: Marker = new BasicMarkerFactory().getMarker("MyMarker")
    val exception = new RuntimeException("foo")
    log.error(Some(marker), "I log, therefore I am", exception)
    log.error(None: Option[Marker], "I log, therefore I am", exception)
  }
}
