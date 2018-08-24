package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public static final String FIZZ_BUZZ = "fizz buzz";

    public String fizzBuzz(Integer number) {

        if((number % 3 ==0) && (number % 5 == 0) &&
                (String.valueOf(number).contains("3") || String.valueOf(number).contains("5"))) {
            return FIZZ_BUZZ + " " + fakeDeluxe(number);
        }
        else if(number % 3 ==0 && (String.valueOf(number).contains("3"))) {
            return "fizz "+ fakeDeluxe(number);
        } else if(number % 5 == 0 && (String.valueOf(number).contains("5"))) {
            return "buzz "+ fakeDeluxe(number);
        }
        else if((number % 3 ==0) && (number % 5 == 0) ||
                (String.valueOf(number).contains("3") && String.valueOf(number).contains("5"))) {
            return FIZZ_BUZZ;
        } else if((number % 3 ==0) &&
                String.valueOf(number).contains("5")) {
            return FIZZ_BUZZ;
        }else  if(number % 5 == 0 &&
                (String.valueOf(number).contains("3"))) {
            return FIZZ_BUZZ;
        }
        else if(number % 3 ==0 || String.valueOf(number).contains("3")) {
            return "fizz";
        } else if(number % 5 == 0 || String.valueOf(number).contains("5")) {
            return "buzz";
        } else {
            return String.valueOf(number);
        }

    }

    private String fakeDeluxe(Integer number) {
        return number%2 ==0 ? "deluxe" : "fake deluxe";
    }

}
