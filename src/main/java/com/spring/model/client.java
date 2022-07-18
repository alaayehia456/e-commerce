package com.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class client {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String fullName;

    @Column
    private String email;

    @Column
    private String phoneNumber;



    @OneToMany(cascade = CascadeType.ALL,mappedBy = "clients")
    private List<reqestOrder> reqestOrderList=new ArrayList<>();



}
