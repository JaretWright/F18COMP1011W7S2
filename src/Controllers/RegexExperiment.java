package Controllers;

public class RegexExperiment {
    public static void main(String[] args)
    {
        String areaCode = "416";
        String validPhoneNum = "7055551234";
        String phoneWithSpaces = "705 555 1234";
        String phoneWithdashes = "705-555-1234";
        String phoneWithDashesAndSpaces = "705 555-1234";


        System.out.printf("%s is a valid area code: %b%n",
                                areaCode, areaCode.matches("[2-9]\\d{2}"));
        String phoneRegex = "[2-9]\\d{2}[-\\s]?[2-9]\\d{2}[-\\s]?\\d{4}";

        System.out.printf("%s is a valid phone #: %b%n", validPhoneNum,
                                                         validPhoneNum.matches(phoneRegex));
        System.out.printf("%s is a valid phone #: %b%n", phoneWithSpaces,
            phoneWithSpaces.matches(phoneRegex));

        System.out.printf("%s is a valid phone #: %b%n", phoneWithdashes,
                phoneWithdashes.matches(phoneRegex));
        System.out.printf("%s is a valid phone #: %b%n", phoneWithDashesAndSpaces,
                phoneWithDashesAndSpaces.matches(phoneRegex));
    }
}
