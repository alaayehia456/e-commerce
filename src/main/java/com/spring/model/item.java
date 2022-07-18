package com.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String img;

    @Column
    private int quantity;

    @Column
    private int price;


    @ManyToOne
    @JoinColumn(name = "itemList")
    private reqestOrder order;


}
