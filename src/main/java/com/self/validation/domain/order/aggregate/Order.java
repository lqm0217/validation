package com.self.validation.domain.order.aggregate;


import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * Order
 */
@Data
public class Order {

  @NotNull
  private Long id = null;

  @NotNull
  private Integer quantity = null;

  private LocalDateTime shipDate = null;

  private String status = null;

  private Boolean complete = false;

}

