package exception;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    final static int LENGTH = 3;
    final static int GO = 1;
    //게임을 이어갈껀지만 결정하는 main
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        Start s = new Start();
        int check = GO;

        //depth가 2 이하로 만들어야하는 것.
        while(check == GO) {
            try {
                GameCycle g = new GameCycle();
                g.GameStart();
            }catch (IllegalArgumentException i){
                System.out.println(i.getMessage());
            }
            do {
                System.out.println("선택해 1과 2");
            } while (!Start.Restart(check = scanner.nextInt()));
        }
    }
}
