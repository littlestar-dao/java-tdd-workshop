public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
        String output;

        if(input.contains("-") ){
             output = input.replace("-","");
             if(output.contains(" ")){
                 output = output.replace(" ", "");
             }
        }else{
            output = input.replace(" ", "");
        }
        return output;
    }

    public String solution(String input){
        String result = "";
        int count = 0;
        input = removeNonDigit(input);
        char[] numbers = input.toCharArray();
        int remain = numbers.length;

        for(int i = 0; i < numbers.length; i++)
        {
            int value1 = Character.getNumericValue(numbers[i]);
            if(numbers.length % 3 == 1){
                if(remain < 4 ){
                    if(remain <= 2) {
                        result += value1;
                    }else{
                        result += value1;
                        result += "-";
                        remain--;
                    }
                }else{
                    if(count < 3) {
                        count++;
                        result += value1;
                        remain--;

                    }else{
                        count = 1;
                        result += "-";
                        result += value1;
                        remain--;
                    }
                }
            }else{
                if(count < 3) {
                    count++;
                    result += value1;
                    remain--;

                }else{
                    count = 1;
                    result += "-";
                    result += value1;
                    remain--;
                }
            }
        }
        return result;
    }

}
