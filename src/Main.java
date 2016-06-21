
public class Main {

    public static void main(String[] args) {

        try{
            String[] result = Palindrome.orderInput(args);
            for (String value : result){
                System.out.println(value);
            }
            /*
            if(Palindrome.isPalindrome(args[0])){
                System.out.println("Is Palindrome");
            } else {
                System.out.println("Is not palindrome");
            }
            */
        } catch (Exception e){
            System.out.println("Pete!!!!");
        }
    }
}
