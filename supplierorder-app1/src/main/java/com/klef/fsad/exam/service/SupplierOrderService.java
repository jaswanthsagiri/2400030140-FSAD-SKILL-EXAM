package com.klef.fsad.exam.service;

import java.util.List;
import com.klef.fsad.exam.model.SupplierOrder;

public interface SupplierOrderService {
    SupplierOrder addSupplierOrder(SupplierOrder order);
    List<SupplierOrder> getAllSupplierOrders();
}
