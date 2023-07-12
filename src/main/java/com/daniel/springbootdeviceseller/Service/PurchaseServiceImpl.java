package com.daniel.springbootdeviceseller.Service;

import com.daniel.springbootdeviceseller.model.Purchase;
import com.daniel.springbootdeviceseller.repository.PurchaseRepository;
import com.daniel.springbootdeviceseller.repository.projection.PurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository purchaseRepository;

    @Autowired
    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public Purchase savePurchase(Purchase purchase){
        purchase.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseItemForUser(Long userId) {
        return purchaseRepository.findAllPurchasesOfUser(userId);
    }
}
