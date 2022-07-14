package com.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class country extends BaseEntity{

   @Column
   private  String name;

   @Column
   private String code;


   @OneToMany(mappedBy = "Country")
   @JsonIgnore
   List<status> statusList=new ArrayList<>();

}
