package com.wutsi.checkout.access

import kotlin.String

public enum class Environment(
  public val url: String,
) {
  SANDBOX("https://checkout-access-server-test.herokuapp.com"),
  PRODUCTION("https://checkout-access-server-prod.herokuapp.com"),
  ;
}
