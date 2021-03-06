package com.lhalj.java.escape.lombok_;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 描述:@EqualsAndHashCode(callSuper = true)比较父类里面的equals 和hashcod
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppleComputer extends Computer{

    private long price;
    private String color;

    public AppleComputer(Integer id,String name, long price, String color){
        super(id, name);
        this.price = price;
        this.color = color;
    }
}
