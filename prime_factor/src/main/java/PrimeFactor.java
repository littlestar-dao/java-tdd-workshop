import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> list = new ArrayList<Integer>();
        if(number % 2 == 0) {
            while (number % 2 == 0) {
                list.add(2);
                number /= 2;
            }
            if(number > 1){
                list.add(number);
            }
        }
        else if(number % 3 == 0){ //3
            while (number % 3 == 0) {
                list.add(3);
                number /= 3;
            }
        }
        return list;
    }
}
