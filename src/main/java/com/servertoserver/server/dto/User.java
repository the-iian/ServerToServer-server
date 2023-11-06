package com.servertoserver.server.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // get, set, toString 자동 생성
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 전체 생성자
public class User { // 롬복 쓴 경우

    private String name;
    private int age;

}
