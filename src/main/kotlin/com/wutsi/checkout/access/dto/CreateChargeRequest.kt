package com.wutsi.checkout.access.dto

import kotlin.Long
import kotlin.String

public data class CreateChargeRequest(
  public val customerEmail: String = "",
  public val deviceId: String = "",
  public val paymentMethodToken: String = "",
  public val businessId: Long = 0,
  public val amount: Long = 0,
  public val orderId: String = "",
  public val description: String? = null,
  public val idempotencyKey: String = "",
)
