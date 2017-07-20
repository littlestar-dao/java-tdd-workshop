public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
        String output;

        if(input.contains("-")){
             output = input.replace("-","");
        }else{
            output = input.replace(" ", "");
        }

        return output;
    }

    public String solution(String input) {
        return null;
    }

}
