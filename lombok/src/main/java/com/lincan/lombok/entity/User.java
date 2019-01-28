package com.lincan.lombok.entity;

import lombok.*;

/**
 * @author: lincan
 * @since: 2018-11-12 14:07
 **/
@Data
@NoArgsConstructor
public class User {

    private String username;

    @NonNull
    public Integer age = 1;

    @NonNull
    private String sex;


}
