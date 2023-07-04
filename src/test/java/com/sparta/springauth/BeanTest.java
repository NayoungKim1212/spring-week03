package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

//    @Autowired // Bean의 타입을 기준으로 DI 지원
//    Food pizza; // Food의 타입으로 Bean을 찾음 ==> Food food; Error
//
//    @Autowired
//    Food chicken;

    @Autowired
    @Qualifier("pizza")
    Food food;

    @Test
    @DisplayName("Primary 와 Qulifier 우선순위 확인")
    void test1() {
        food.eat();

    }
}
