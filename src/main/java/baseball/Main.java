package baseball;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        NumberGenerator numberGenerator = new NumberGenerator();
        PlayerNum playerNum = new PlayerNum();
        PlayAgain playAgain = new PlayAgain();
        CompareNum compareNum = new CompareNum();

        boolean reset = true;

        // == 은 주소값을 비교하므로 내용을 비교하기 위해서는 equals()를 사용해야한다
        while (reset) {
           List<Integer> computerNum = numberGenerator.makeRandomNum();
           String result = compareNum.isContainNum(computerNum, playerNum.inputNumber());
           if(result.equals("0 ball 3 strike")){
               System.out.println("축하합니다. 게임을 계속할까요? y/n");
               reset = playAgain.response();
           }
        }

    }
}



