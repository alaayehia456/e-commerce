package com.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Locale;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name =  "orderfood")
public class Order extends caregory_order{

    @Column
    private int price;
    @Column(name = "image")
    private String img;

    @Column
    @Lob
    private  String description;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Categor category;


}
