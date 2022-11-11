package prac.jhkim.redis.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import prac.jhkim.redis.domain.Member;
import prac.jhkim.redis.repository.MemberRedisRepository;

@SpringBootTest
class RedisRepositoryServiceTest {


    @Autowired
    MemberRedisRepository memberRedisRepository;

    @AfterEach
    public void cleanup() {
        memberRedisRepository.deleteAll();
    }

    @Test
    void addMember() {
        Member member = new Member("jan", 99);
        memberRedisRepository.save(member);
    }
}