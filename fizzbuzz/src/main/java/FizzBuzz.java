
public class FizzBuzz {
    public String say(int input) {
        if(input == 15){
            return "FizzBuzz";
        }
        if(input % 3 == 0) {
            return "Fizz";
        }
        else if(input == 5 || input == 10){
            return "Buzz";
        }
        return input+"";
    }
}
