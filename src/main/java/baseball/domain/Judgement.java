package baseball.domain;

import java.util.List;

public class Judgement {

    public int correctCount(List<Integer> computer, List<Integer> player){
        int result = 0;
        for (int i = 0; i < computer.size(); i++) {
            int computerNumber = computer.get(i);
            if (player.contains(computerNumber)) {
                result++;
            }
        }
        return result;
    }

    public boolean hasPlace(List<Integer> computer, int placeIndex, int number){

        return computer.get(placeIndex) == number;
    }

}
