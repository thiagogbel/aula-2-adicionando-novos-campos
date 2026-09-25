package com.example.crud.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name="product")
@Entity(name="product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price;

    private Boolean active;

    private String category;

    // STRING grava RJ/MG/SP. ORDINAL gravaria 0,1,2 e quebra se a gente mudar a ordem do enum
    @Enumerated(EnumType.STRING)
    @Column(name = "distribution_center")
    private DistributionCenter distributionCenter;

    public Product(RequestProduct requestProduct){
        this.name = requestProduct.name();
        this.price = requestProduct.price();
        this.category = requestProduct.category();
        this.distributionCenter = requestProduct.distributionCenter();
        this.active = true;
    }
}
