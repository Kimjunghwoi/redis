package prac.jhkim.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import prac.jhkim.redis.domain.Member;
import prac.jhkim.redis.repository.MemberRedisRepository;
import prac.jhkim.redis.service.RedisTemplateService;

import java.util.Arrays;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
     MemberRedisRepository memberRedisRepository;
    @Autowired
    RedisTemplateService redisTemplateService;

    @Test
    public void addMember() {
        Member member = new Member("jan", 99);
        memberRedisRepository.save(member);
    }

    @Test
    public void test() {
        redisTemplateService.test();
    }

    public int[] solution(int[] numbers) {
        numbers = new int[]{1, 2, 3, 4, 5};
        int[] answer = new int[numbers.length];

        for (int i = 0; i< numbers.length; i++) {
            answer[i] =  numbers[i] * 2;
        }
        return answer;
    }


    //length / 2 몫 만큼 인덱스이동.. 그 전에 작은 순으로 정렬..
    public int solution2(int[] array) {
        array = new int[]{9, -1, 0};
        Arrays.sort(array);
        System.out.println("array = " + Arrays.toString(array));
        int answer = array[array.length / 2];
        System.out.println("answer = " + answer);
        return answer;
    }

    public int solution3(int[] array) {
        array = new int[]{1};
        int maxValue = 0;
        for (int x : array) {
            if (maxValue < x) {
                maxValue = x;
            }
        }
        int[] answers = new int[maxValue+1];
        for (int y : array) {
            answers[y]++;
        }
        int max = 0;
        int index =0;
        int answer = 0;
        for (int y : answers) {
            if(max < y){
                max = y;
                answer = index;
            } else if (max == y) {
                answer = -1;

            }
            index++;
        }

        return answer;
//
    }



//
//    public static int find(int[] a, int target)
//    {
//        System.out.println("a+\"/\"+target = " + Arrays.toString(a) +"/"+target);
//        return IntStream.range(0, a.length)
//                .filter(i -> target == a[i])
//                .findFirst()
//                .orElse(-1);    // 타겟을 찾지 못하면 -1 반환
//    }

    public int[] solution4(int n) {
        int mok = n/2;
        int naMuG = n%2;
        int[] answer = new int[mok + naMuG];
        int index =0;
        for (int i = 0; i <= n; i++) {
            if ((i % 2) != 0) {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }


    @Test
    void contextLoads() {
        solution3(new int[]{});

    }

}
