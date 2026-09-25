package com.EPS.eps.Entity;
import lombok.*;

import java.math.BigDecimal;

import jakarta.persistence.*;


@Entity 
@Table(name="products")
@Getter 
@Setter     
@NoArgsConstructor 
@AllArgsConstructor 
public class Product {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false , precision=10,scale=2)
    private BigDecimal price;

}
