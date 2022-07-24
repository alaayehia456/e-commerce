package com.spring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.spring.model.*;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class pruchesRequest {

    private client  client1;

    private reqestOrder reqestorder;

    private List<item> itemList=new ArrayList<>();

    private address fromAddress;

    private address toAddress;

}
