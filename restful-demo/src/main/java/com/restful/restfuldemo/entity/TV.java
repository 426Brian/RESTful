package com.restful.restfuldemo.entity;

import lombok.*;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.Date;


@AllArgsConstructor
@Data
@Accessors(chain = true)
public class TV {
    private static int a = 0;

    public TV() {
        ++a;
        System.out.println("a == "+a);
    }
    @Null
    private Integer id;
    @NotNull
    private String name;
    private Integer seasonCount;
    private Date originalRelease;

    public static void main(String[] args) {
        TV tv = new TV();
        TV tv1 = new TV();

        System.out.println("== "+(tv == tv1));
        System.out.println("equals "+tv.equals(tv1));
        System.out.println("tv hashcode "+tv.hashCode()+" tv1 hashcode  "+tv1.hashCode());

    }
}
