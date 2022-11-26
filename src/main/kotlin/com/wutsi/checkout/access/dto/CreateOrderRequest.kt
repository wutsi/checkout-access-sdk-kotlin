package com.wutsi.checkout.access.dto

import kotlin.Long
import kotlin.String
import kotlin.collections.List

public data class CreateOrderRequest(
  public val deviceIp: String? = null,
  public val deviceType: String? = null,
  public val channelType: String? = null,
  public val businessId: Long = 0,
  public val notes: String? = null,
  public val currency: String = "",
  public val customerId: Long? = null,
  public val customerName: String = "",
  public val customerEmail: String = "",
  public val items: List<CreateOrderItemRequest> = emptyList(),
  public val discounts: List<CreateOrderDiscountRequest> = emptyList(),
)
