package prac.jhkim.redis.repository;


import org.springframework.data.repository.CrudRepository;
import prac.jhkim.redis.domain.Member;

public interface MemberRedisRepository extends CrudRepository<Member, String> {
}
