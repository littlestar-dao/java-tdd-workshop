public class MyRange {
    public String of(String input) {
        return null;
    }

    public int getLastNumber(String input) {
        return 0;
    }

    public boolean isก้ามปูปิด(String input) {
        return false;
    }

    public int getFirstNumber(String input) {

        return Character.getNumericValue(input.charAt(1));
    }

    public boolean isก้ามปูเปิด(String input) {
        if(input.charAt(0) == '['){
            return true;
        }
        return false;
    }
}
