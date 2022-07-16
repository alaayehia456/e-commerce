package com.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class reqestOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String code;

    @Column
    private String note;

    @Column
    private int totalPrice;

    @Column
    private int totalQuantity;

    @Column
    private Date dateCreate;

    @Column
    private Date dateUpdate;


}
