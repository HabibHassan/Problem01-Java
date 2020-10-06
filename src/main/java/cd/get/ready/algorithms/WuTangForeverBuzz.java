package cd.get.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan(int value){
        String number = String.valueOf(value)
        for(int i=0; i<value; i++)
            if(value%3 == 0){
                return "Wu";
            }
        else if (value%3 == 0 && value%5 ==0){
            return "WuTangForever";

        }
        else if (value%5 == 0){
            return "Tang";
        }
        return value;
    }

}



