/**
 *
 * @author Akmal N.F
 */
public class Exception3 {
    public static void main(String[] args) {
        int bil = 10;
        try{
            System.out.println(bil/0);
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException: Cannot divided zero");
        }
    }
}
