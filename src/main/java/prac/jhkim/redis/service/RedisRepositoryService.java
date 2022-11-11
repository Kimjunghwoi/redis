package prac.jhkim.redis.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import prac.jhkim.redis.domain.Member;
import prac.jhkim.redis.repository.MemberRedisRepository;

@RequiredArgsConstructor
@Service
public class RedisRepositoryService {

    private final MemberRedisRepository memberRedisRepository;

    public void addMember() {
        Member member = new Member("jan", 99);
        memberRedisRepository.save(member);
    }

}
