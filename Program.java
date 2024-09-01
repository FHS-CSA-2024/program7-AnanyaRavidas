//import stuff here
import java.util.Scanner;
//Your code here
public class Program7 {
    public static void main(String[] args) {
        int schrute = 0;
        int klevin1 = 0;
        int stanleyNickels = 0;
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter schrute-bucks: ");
        schrute = myScanner.nextInt();
        System.out.println(" ");
        System.out.print("Enter klevins: ");
        klevin1 = myScanner.nextInt();
        System.out.println("  ");
        System.out.print("Enter stanley nickles: ");
        stanleyNickels = myScanner.nextInt();
        System.out.println("");
        
        int totalStanleyNickels = stanleyNickels + (klevin1 * 12);
        //double decimalSchruteBucks = totalOldSchruteBucks * 2.4; // 240/100 = 2.4
        double decimalSchruteBucks = schrute + (totalStanleyNickels / 240.0) * 100 / 100.0;
        decimalSchruteBucks = Math.round(decimalSchruteBucks * 100.0) / 100.0;
        System.out.print("Decimal Schrute Bucks = ");
        System.out.println("$" + decimalSchruteBucks);
    }
}
    

//Paste console output below:
/*
Enter schrute-bucks: 7

Enter klevins: 17

Enter stanley-nickels: 9

Decimal schrute-bucks = $7.89

*/
