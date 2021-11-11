package com.bridgelabzregex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Email2 {
        public boolean isEmail(String email) {
            Pattern pattern = Pattern.compile("^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$");
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
}
