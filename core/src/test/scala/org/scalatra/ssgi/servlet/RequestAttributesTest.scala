package org.scalatra.ssgi
package servlet

import org.scalatest.matchers.ShouldMatchers
import org.scalatra.test.scalatest.ScalatraFunSuite

class RequestAttributesTest extends ScalatraFunSuite with ShouldMatchers with AttributesTest {
  addServlet(new AttributesServlet {
    def attributesMap = request
  }, "/*")
}

