package com.project.onlineOrderingSystemFromAutoPartsSuppliers.controller;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.OrderItem;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.OrderItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/orderItem")
@RestController
@AllArgsConstructor
public class OrderItemController {
    private final OrderItemService orderItemService;

    @GetMapping("/getAll")
    public List<OrderItem> getAllOrderItems() {

        return orderItemService.getAllOrderItems();
    }

    @PostMapping("/add")
    public OrderItem addOrderItem(@RequestBody OrderItem orderItem) {
        orderItemService.addOrderItem(orderItem);
        return orderItem;
    }

    @PutMapping("/update")
        public String updateOrderItem(@RequestBody OrderItem orderItem) {
        orderItemService.updateOrderItem(orderItem);
        return "Success";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteOrderItem(@PathVariable Long id) {
        orderItemService.deleteOrderItem(id);
        return "Success";
    }
}
