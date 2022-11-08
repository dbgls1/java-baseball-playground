package baseball;

import java.util.List;

public class CompareNum {

    public String isContainNum(List<Integer> computerNum, List<Integer> playerNum) {

        int strike = 0; //스트라이크 개수
        int containedNum = 0; //볼 혹은 스트라이크 개수
        int ball = 0;

        for (int i = 0; i < playerNum.size(); i++) {
            if (computerNum.contains(playerNum.get(i))) {
                containedNum++;
            }
        }

        for (int i = 0; i < playerNum.size(); i++) {
            if (computerNum.get(i) == playerNum.get(i)) {
                strike++;
            }
        }

        if (containedNum == 0) {
            return "out";
        }

        //ball 변수 위치에 따라 값이 바뀐다
        ball = containedNum - strike;

        return ball + " ball " + strike + " strike";
    }

}
