package baseball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PlayerNum {

    public List<Integer> inputNumber() throws IOException {
        System.out.println("1~9까지 서로 다른 3자리 수를 입력해주세요");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = (br.readLine()).split("");

        List<Integer> num = new ArrayList<>();
        for (String item : str) {
            num.add(Integer.valueOf(item));
        }

        System.out.println("플레이어 수: " + num.toString());
        return num;
    }

}
