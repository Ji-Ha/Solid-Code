package exception;

import java.util.ArrayList;

//게임이 돌아가는 것을 관리하는 class
public class GameCycle{
    static private ArrayList<Integer> UserValue = new ArrayList<>(Application.LENGTH);
    static private ArrayList<Integer> CompValue = new ArrayList<>(Application.LENGTH);


    GameCycle(){
        MakeNumber CompM = new MakeNumber();
        this.CompValue = CompM.GetTarget();
    }
    //게임을 시작하는 함수.
    public void GameStart(int answer){
        //사용자의 입력값 저장.
        MakeNumber UserM = new MakeNumber(answer);
        UserValue = UserM.GetTarget();

        /*
        이제는 while문을 통하여, 사용자의 입력을 계속해서 받아야 함.
        그러면서, 볼, 스트라이크, 낫싱 아니면 합격을 판단하는 함수가 필요함.

        
         */
        //test
        for(Integer a : UserValue){
            System.out.print(a);
        }
        System.out.println();

        for(Integer a : CompValue){
            System.out.print(a);
        }
        System.out.println();
    }
}
