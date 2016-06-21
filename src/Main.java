
public class Main {

    public static void main(String[] args) {

        try{
            String result = Palindrome.orderInput(args[0]);
            System.out.println(result);
        } catch (Exception e){
            System.out.println("Pete!!!!");
        }
    }
}