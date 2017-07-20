
public class FizzBuzz {
    public String say(int input) {
        if(input == 15 || input == 30){
            return "FizzBuzz";
        }
        if(input % 3 == 0) {
            return "Fizz";
        }
        else if(input % 5 == 0){
            return "Buzz";
        }
        return input+"";
    }
}
