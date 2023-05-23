import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {


        String email = "testing@email.com";
        String invalidEmail = "testing@email";

        String emailPattern = "^\\w[A-Za-z0-9._%+-]+@[A-Za-z-]+\\.[A-Za-z0-9]+$";
        System.out.println("Email Validation");
        System.out.println(email + " - Is valid: " +Pattern.matches(emailPattern, email));
        System.out.println(invalidEmail + " - Is valid: " +Pattern.matches(emailPattern, invalidEmail));

        String phoneNum = "(123) 456-7890";
        String noPhoneNum = "(7o4) 456-8907";

        String phoneNumPattern = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
        System.out.println("\nPhone Number Validation");
        System.out.println(phoneNum + " - Is valid: "+ Pattern.matches(phoneNumPattern,phoneNum ));
        System.out.println(noPhoneNum + " - Is valid: "+ Pattern.matches(phoneNumPattern, noPhoneNum));

        String validDate = "05/24/2004";
        String notValidDate = "5-24-2004";

        String datePattern = "^(0[1-9]|1[0-2])/([012]\\d|3[01])/(\\d{4})$";
        System.out.println("\nDate Validation");
        System.out.println(notValidDate + " - Date is valid: "+ Pattern.matches(datePattern,notValidDate ));
        System.out.println(validDate + " - Date is valid: "+ Pattern.matches(datePattern, validDate));

        String validURL = "https://www.learningtocode.com";
        String notValid = "practicemorecoding.com";

        String urlPattern = "^(https?)://[^\\s/$.?#].[^\\s]*$";
        System.out.println("\nURL Validation");
        System.out.println(validURL + " - URL is valid: "+ Pattern.matches(urlPattern,validURL ));
        System.out.println(notValid + " - URL is valid: "+ Pattern.matches(urlPattern, notValid));

        String validCard = "5453 8986 7896 8976";
        String notValidCC = "67589980 431786";

        String ccPattern = "^(\\d{4}[- ]){3}\\d{4}$";
        System.out.println("\nCredit Card Number Validation");
        System.out.println(validCard + " - Credit Card number is valid: "+ Pattern.matches(ccPattern,validCard));
        System.out.println(notValidCC + " - Credit Card is valid: "+ Pattern.matches(ccPattern, notValidCC));

        String validZip = "67654";
        String notValidZip = "786-7865";

        String zipPattern = "^\\d{5}(-\\d{4})?$";
        System.out.println("\nZip Code Validation");
        System.out.println(validZip + " - Zipcode is valid: "+ Pattern.matches(zipPattern,validZip));
        System.out.println(notValidZip + " - Zipcode is valid: "+ Pattern.matches(zipPattern, notValidZip));

        String validJavaID = "_myIdentfier";
        String notValidJava = "987ytr";

        String javaIDPattern = "^\\d{5}(-\\d{4})?$";
        System.out.println("\nJava Identifier Validation");
        System.out.println(validZip + " - Java identifier is valid: "+ Pattern.matches(javaIDPattern,validJavaID));
        System.out.println(notValidZip + " - Java identifier is valid: "+ Pattern.matches(javaIDPattern, notValidJava));

        String validHex = "#000000";
        String notValidHex = "90FF00";

        String hexPattern = "#[0-9A-Fa-f]{6}$";
        System.out.println("\nHexadecimal Color Validation");
        System.out.println(validHex + " - Hex Color is valid: "+ Pattern.matches(hexPattern,validHex));
        System.out.println(notValidHex + " - Hex Color is valid: "+ Pattern.matches(hexPattern, notValidHex));

        String validTIme = "18:30";
        String notValidTime = "2200";

        String timePattern = "^([01][0-9]|2[0-3]):[0-5][0-9]$";
        System.out.println("\nTime Validation");
        System.out.println(validTIme + " - Time is valid: "+ Pattern.matches(timePattern,validTIme));
        System.out.println(notValidTime + " - Time is valid: "+ Pattern.matches(timePattern, notValidTime));


    }


}