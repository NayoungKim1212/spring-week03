package com.sparta.springauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig { // passwordConfig로 저장됨

    @Bean // Spring 서버가 뜰 때 Spring IoC Container에 Bean으로 저장
    public PasswordEncoder passwordEncoder() { // passwordEncoder로 등록됨
        return new BCryptPasswordEncoder(); // BCryptPasswordEncoder : 구현체
        // BCrypt : Hash 함수(비밀번호를 암호화 해주는 Hash 함수)
    }
}