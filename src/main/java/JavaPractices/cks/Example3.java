package JavaPractices.cks;


public class Example3 {
    public static final String regularExpression = "^([a-zA-Z]\\w{7,29})$";

    public static void main(String[] args) {


        String userName = "Samantha_21";

        if (userName.matches(regularExpression)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}


