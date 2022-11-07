public class CheckInput {
    
    public boolean isGoodInput(String input) {
        String example = "[0-9]+";
        boolean isGoodInput = input.matches(example);
        Boolean good = true;
        if (isGoodInput) {
            Double num1 = Double.parseDouble(input);
            if (num1<=0) {
                good = false;
            } 
        } else {
            good = false;
        }
        return good;
    }
}
