import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> list = new ArrayList<Integer>();
        if(number % 2 == 0){
            list.add(2);
            int divide = number/2;
            if(divide % 2 == 0 && divide > 2){ //8
                list.add(divide/2);
                if(divide/2 == 2){
                    list.add(2);
                }
            }
            else if(divide > 1){ //6, 4
                list.add(divide);
            }
        }
        else if(number % 3 == 0){ //3
            list.add(3);
            int divide1 = number/3;
            if(divide1 >= 3){
                list.add(divide1);
            }
        }
        return list; //1,2
    }
}
