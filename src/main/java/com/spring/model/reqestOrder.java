package com.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    @Lob
    private String note;

    @Column
    private int totalPrice;

    @Column
    private int totalQuantity;

    @Column
    @CreationTimestamp
    private Date dateCreate;

    @Column
    @UpdateTimestamp
    private Date dateUpdate;



    @OneToMany(cascade = CascadeType.ALL,mappedBy = "order")
    private List<item> itemList=new ArrayList<>();



    @ManyToOne
    @JoinColumn(name = "client_id")
    private client clients;


    @OneToOne
    @JoinColumn(name = "adress_id",referencedColumnName = "id")
    private address Address;

    @OneToOne
    @JoinColumn(name = "form_adress_id",referencedColumnName = "id")
    private address fromAddress;

}
