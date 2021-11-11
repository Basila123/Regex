package com.bridgelabzregex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    /**
     * This method checks if the entered number is valid or not
     *
     * @param Number takes in the parameter as String representation of number
     * @return it returns a boolean value true if the number is valid
     */
    public boolean isNumber(String Number) {
            Pattern pattern = Pattern.compile("^[0-9]{2}+[ ][0-9]{10}$");
            Matcher matcher = pattern.matcher(Number);
            return matcher.matches();
        }

        //driver code

        }
    

