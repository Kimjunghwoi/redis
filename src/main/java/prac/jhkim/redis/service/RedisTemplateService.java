package prac.jhkim.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import prac.jhkim.redis.domain.MyData;

@Service
public class RedisTemplateService {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    public void useRedisTemplate() {

//        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
//        valueOperations.set(rRTKey + user.getIdx(), refreshToken);
//        log.info("redis RT : {}", valueOperations.get(rRTKey + user.getIdx()));

    }

    public void test() {

        //hashmap 같은 key value 구조
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        MyData data = new MyData();
        data.setStudentId("1234566");
        data.setName("HongGilDong");
        valueOperations.set("key", data);

        MyData data2 = (MyData) valueOperations.get("key");
        System.out.println(data2);
    }

}
