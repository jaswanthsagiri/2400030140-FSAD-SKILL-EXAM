package com.klef.fsad.exam.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.exam.model.SupplierOrder;
import com.klef.fsad.exam.repository.SupplierOrderRepository;

@Service
public class SupplierOrderServiceImpl implements SupplierOrderService {

    @Autowired
    private SupplierOrderRepository repository;

    @Override
    public SupplierOrder addSupplierOrder(SupplierOrder order) {
        return repository.save(order);
    }

    @Override
    public List<SupplierOrder> getAllSupplierOrders() {
        return repository.findAll();
    }
}
