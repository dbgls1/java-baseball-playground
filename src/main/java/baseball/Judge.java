package baseball;

import java.util.List;

//스트라이크, 볼, 아웃 개수 판단하기
public class Judge {

    public String judgement(List<Integer> computer, List<Integer> player){
        Compare compare = new Compare();
        int total = compare.howMany(computer, player);
        int strike = compare.countStrike(computer, player);
        int ball = total - strike;

        if(total == 0)
            return "아웃";
        if(strike == 0)
            return ball + "볼";
        if(ball == 0)
            return strike + "스트라이크";
        return ball + "볼 " + strike + "스트라이크";
    }
}
