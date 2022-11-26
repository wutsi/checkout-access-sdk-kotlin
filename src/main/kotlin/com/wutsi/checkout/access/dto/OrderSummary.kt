package com.wutsi.checkout.access.dto

import java.time.OffsetDateTime
import kotlin.Long
import kotlin.String

public data class OrderSummary(
  public val id: String = "",
  public val shortId: String = "",
  public val businessId: Long = 0,
  public val status: String = "",
  public val subTotalPrice: Long = 0,
  public val totalDiscount: Long = 0,
  public val totalPrice: Long = 0,
  public val totalPaid: Long = 0,
  public val balance: Long = 0,
  public val currency: String = "",
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val updated: OffsetDateTime = OffsetDateTime.now(),
  public val cancelled: OffsetDateTime? = null,
  public val closed: OffsetDateTime? = null,
  public val customerId: Long? = null,
  public val customerName: String = "",
  public val customerEmail: String = "",
)
