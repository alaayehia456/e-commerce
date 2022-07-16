package com.spring.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class caregory_order extends BaseEntity{

    @Column
    @NonNull
    private String name;

    @Column
    @CreationTimestamp
    private Date Datecreat;

    @Column
    @UpdateTimestamp
    private Date DateUpdate;



}
