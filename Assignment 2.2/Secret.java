import java.util.Scanner;
import javax.swing.*;

class Secret {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        
        while (run == true) {
            System.out.println("Enter the password, incorrect answers will not be tolerated.");
            
            System.out.println("");
            
            String ans = sc.nextLine();
            
            System.out.println("");
            
            if (ans.equals("dragon")) {
                System.out.println("You may enter.");
                
                System.out.println("");
                
                System.out.println("*Do you want to ''enter'' or ''run''?*");
                
                System.out.println("");
                
                String c1 = sc.nextLine();
                
                System.out.println("");
                
                if (c1.equals("enter")) {
                    System.out.println("There is no going back now.");
                    run = false;
                } else if (c1.equals("run")) {
                    System.out.println("Smart choice.");
                    run = false;
                }
            } else {
                System.out.println("We are coming, you have two days.");
                run = false;
            }
            System.out.println("");
        }
    }
}