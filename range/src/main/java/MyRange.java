public class MyRange {
    public String of(String input) {
        return null;
    }

    public int getLastNumber(String input) {
        return 0;
    }

    public boolean isก้ามปูปิด(String input) {
        if(input.charAt(4) == ']'){
            return true;
        }
        return false;
    }

    public int getFirstNumber(String input) {
        if(isก้ามปูเปิด(input)){
            return Character.getNumericValue(input.charAt(1));
        }else{
            return Character.getNumericValue(input.charAt(1))+1;
        }

    }

    public boolean isก้ามปูเปิด(String input) {
        if(input.charAt(0) == '['){
            return true;
        }
        return false;
    }
}
