package baseball;


import java.util.Scanner;

//경기 재시작 여부
public class Playagain {

    public boolean playagain(){
        System.out.println("축하합니다! 경기를 다시 시작하겠습니까? 다시 시작 : 1, 종료 : 2");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if(answer == 1){
            return true;
        }
        return false;
    }
}
