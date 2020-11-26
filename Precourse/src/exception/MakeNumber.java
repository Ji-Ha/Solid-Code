package exception;

import java.util.ArrayList;

public class MakeNumber {
    final static int StartNum = 1;
    final static int EndNum = 9;
    private ArrayList<Integer> target = new ArrayList<>();

    //target에 element 중복을 체크하는 함수.
    private boolean IsUsed(int element){
        if(!target.contains(element)){
            return true;
        }
        else{
            return false;
        }
    }

    //target을 만든다.
    MakeNumber(){
        while(target.size() < Application.LENGTH){
            int element = RandomUtils.nextInt(StartNum, EndNum);
            if(IsUsed(element)){
                target.add(element);
            }
        }
    }

    //private한 target return 하는 함수.
    protected ArrayList<Integer> GetTarget(){
        return this.target;
    }
}
