package com.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Authorities extends BaseEntity{

    @Column
    private String roleName;


    @ManyToMany(mappedBy = "authoritiesList")
    private List<user> userList=new ArrayList<>();


}
