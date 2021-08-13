package com.study.jpa.bookmanager.repository;

import com.study.jpa.bookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest // 스프링 컨텍스트를 로딩을 해서 테스트에 활용
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {
        userRepository.save(new User());

        System.out.println(">>> " + userRepository.findAll());
    }
}