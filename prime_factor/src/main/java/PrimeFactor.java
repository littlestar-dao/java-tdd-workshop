import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> list = new ArrayList<Integer>();
        if(number % 2 == 0){
            list.add(2);
            int divide = number/2;
            if(divide > 1){
                list.add(divide);
            }

        }
        else if(number != 1 && number % 2 != 0){
            list.add(number);
        }
        return list;
    }
}
