package com.spring.model;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Data
@NoArgsConstructor
@Entity
@Table(name = "category")
public class Categor extends caregory_order{

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<Order> orders;

    @Column
    @NonNull
    private String logo;


}
