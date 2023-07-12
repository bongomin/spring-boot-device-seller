package com.daniel.springbootdeviceseller.Service;

import com.daniel.springbootdeviceseller.model.Purchase;
import com.daniel.springbootdeviceseller.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemForUser(Long userId);
}
