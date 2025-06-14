package com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
class OrderItemId implements Serializable {
    private Long orderId;
    private Long partId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItemId that = (OrderItemId) o;
        return Objects.equals(orderId, that.orderId) &&
                Objects.equals(partId, that.partId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, partId);
    }
}

@Entity
@Getter
@Setter
@Table(name = "order_item")
@IdClass(OrderItemId.class)
public class OrderItem {

    @Id
    @Column(name = "order_id", nullable = false)
    private Long orderId;

    @Id
    @Column(name = "part_id", nullable = false)
    private Long partId;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "price", nullable = false)
    private Float price;


}