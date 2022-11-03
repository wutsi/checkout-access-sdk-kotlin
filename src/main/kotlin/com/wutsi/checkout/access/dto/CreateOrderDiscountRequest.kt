package com.wutsi.checkout.access.dto

import kotlin.Long
import kotlin.String

public data class CreateOrderDiscountRequest(
  public val code: String = "",
  public val amount: Long = 0,
  public val type: String = "",
)
