package baseball;

import java.util.Scanner;

public class PlayAgain {
    public boolean response(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().equals("n")){
            scanner.close();
            return false;
        }else {
            return  true;
        }

    }

}
