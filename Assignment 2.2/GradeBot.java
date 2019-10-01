import java.util.Scanner;

class GradeBot {
    public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            boolean run = true;
        
            while (run == true) {
                System.out.println("What was your mark on the test? Enter a letter to stop the program.");
                
                System.out.println("");
                
                double m = sc.nextDouble();
                
                System.out.println("");
                
                System.out.println("What was the test out of?");
                
                System.out.println("");
                
                double t = sc.nextDouble();
                
                System.out.println("");
                
                double p = 0;
                
                if (t != 0) {
                    p = (m / t)*100.0;
                } else {
                    System.out.println("Nope, don't do that, don't you dare.");
                    System.exit(0);
                }
                
                String g = "";
                
                if (p >= 86) {
                    g = "A";
                } else if (p <= 85 && p >= 73) {
                    g = "B";
                } else if (p <= 72 && p >= 67) {
                    g = "C+";
                } else if (p <= 66 && p >= 60) {
                    g = "C";
                } else if (p <= 59 && p >= 50) {
                    g = "C-";
                } else if (p <= 49) {
                    g = "F";
                }
                
                System.out.println("You got " + p + "% on the test, a letter grade of " + g + ".");
                
                System.out.println("");
                
                if (g.equals("A")) {
                    System.out.println("Good job!");
                } else if (g.equals("B")) {
                    System.out.println("You could have done better, I am a little disappointed in you.");
                } else if (g.equals("C+")) {
                    System.out.println("I am disappointed in you.");
                } else if (g.equals("C")) {
                    System.out.println("I am very disappointed in you.");
                } else if (g.equals("C-")) {
                    System.out.println("You are absolutely pathetic.");
                } else if (g.equals("F")) {
                    System.out.println("Wow. Just... wow.");
                }
            
                System.out.println("");
        }
    }
}

