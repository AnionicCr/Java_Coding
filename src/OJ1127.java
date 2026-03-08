import java.util.Scanner;
public class OJ1127{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String a = input.nextLine();
            if(a.equals("End of file"))
                return;
            String b = a.toUpperCase();
            System.out.println(b);
        }
    }
}
