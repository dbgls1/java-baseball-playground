package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


//Random객체 사용하여 난수 만들기
public class GenerateRandomNum {


    public int randomMake(){
        //현재 시스템 시간을 seed 값으로 가지는 Ramdom 객체를 생성
        long seed = System.currentTimeMillis();
        Random random = new Random(seed);

        return random.nextInt(9) + 1;
    }

    //리스트에 중복없는 난수 3개 저장하기
    public List<Integer> create(){
        List<Integer> computerNumber = new ArrayList<>();
        while (computerNumber.size() < 3){
            int randomNumber = randomMake();
            if(computerNumber.contains(randomNumber))
                continue;
            computerNumber.add(randomNumber);
        }
        return computerNumber;
    }
}