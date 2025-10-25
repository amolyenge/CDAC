public class CheckAlphanumeric {
    public static void main(String[] args) {
        String str = "Hello123";

        boolean isAlphanumeric = true;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                isAlphanumeric = false;
                break;
            }
        }

        if (isAlphanumeric)
            System.out.println("String is Alphanumeric");
        else
            System.out.println("String is NOT Alphanumeric");
    }
}
