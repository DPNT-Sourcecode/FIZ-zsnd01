package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        if((number % 3 ==0) && (number % 5 == 0) &&
                (number > 10 && String.valueOf(number).chars().distinct().count() == 1)) {
            return "fizz buzz deluxe";
        }
       else if(number % 3 ==0 && (number > 10 && String.valueOf(number).chars().distinct().count() == 1)) {
            return "fizz deluxe";
        } else if(number % 5 == 0 && (number > 10 && String.valueOf(number).chars().distinct().count() == 1)) {
            return "buzz deluxe";
        }  else if(number > 10 && String.valueOf(number).chars().distinct().count() == 1) {
            return "deluxe";
        }
        else if((number % 3 ==0) && (number % 5 == 0) ||
                (String.valueOf(number).contains("3") && String.valueOf(number).contains("5"))) {
            return "fizz buzz";
        } else if((number % 3 ==0) &&
                String.valueOf(number).contains("5")) {
            return "fizz buzz";
        }else  if(number % 5 == 0 &&
                (String.valueOf(number).contains("3"))) {
            return "fizz buzz";
        }
        else if(number % 3 ==0 || String.valueOf(number).contains("3")) {
            return "fizz";
        } else if(number % 5 == 0 || String.valueOf(number).contains("5")) {
            return "buzz";
        } else {
            return String.valueOf(number);
        }

    }

}
