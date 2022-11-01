package baseball;

import java.util.List;

//컴퓨터 수와 플레이어 수 3자리 비교하기
public class Compare {

    //(스트라이크 혹은 볼)의 개수 구하기
    public int howMany(List<Integer> computer, List<Integer> player){
        int result = 0;
        for(int i = 0; i < player.size(); i++){
            if(computer.contains(player.get(i))){
                result += 1;
            }
        }
        return result;
    }

    //스트라이크 개수 구하기, 볼의 개수 = howmany - countStrike
    public int countStrike(List<Integer> computer, List<Integer> player){
        int strike = 0;
        for(int i = 0; i < player.size(); i++){
            if(computer.get(i) == player.get(i)){
                strike += 1;
            }
        }
        return strike;
    }
}