package com.klef.fsad.exam.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.SupplierOrder;
import com.klef.fsad.exam.service.SupplierOrderService;

@RestController
@RequestMapping("/supplierorder")
public class SupplierOrderController {

    @Autowired
    private SupplierOrderService service;

    // POST: Add SupplierOrder
    @PostMapping("/add")
    public SupplierOrder addSupplierOrder(@RequestBody SupplierOrder order) {
        return service.addSupplierOrder(order);
    }

    // GET: Retrieve all SupplierOrders
    @GetMapping("/all")
    public List<SupplierOrder> getAllSupplierOrders() {
        return service.getAllSupplierOrders();
    }
}
