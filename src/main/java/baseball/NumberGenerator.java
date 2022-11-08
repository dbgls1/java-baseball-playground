package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {

    private final static int MAX_NUM = 3;

    public List<Integer> makeRandomNum() {

        List<Integer> numbers = new ArrayList<>();

        while (numbers.size() < MAX_NUM) {
            Integer n = new Random().nextInt(9) + 1;

            if (!numbers.contains(n)) {
                numbers.add(n);
            }
        }
        System.out.println("컴퓨터 수: " + numbers.toString());
        return numbers;
    }


}
