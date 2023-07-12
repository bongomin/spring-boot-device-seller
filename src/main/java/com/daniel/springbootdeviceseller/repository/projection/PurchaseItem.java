package com.daniel.springbootdeviceseller.repository.projection;

import java.time.LocalDateTime;

public interface PurchaseItem {
    String getName();
    String getType();
    Double getPrice();
    String getColor();
    LocalDateTime getPurchaseTime();
}
