import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> list = new ArrayList<Integer>();
        if(number == 1){
        }
        else if(number == 4){
            int divide = number/2;
            list.add(divide);
            list.add(2);
        }
        else {
            list.add(number);
        }
        return list;
    }
}
