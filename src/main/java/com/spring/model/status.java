package com.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class status extends BaseEntity{

    @Column
     private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    
    private country Country;
}
