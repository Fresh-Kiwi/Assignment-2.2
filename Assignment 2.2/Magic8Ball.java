import java.util.Scanner;

class Magic8Ball {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        boolean r14 = false;
        
        while (run == true) {
            System.out.println("I am the Magic 8-Ball, ask your question and I will answer. Enter ''exit'' to stop my hea- the program.");
            
            System.out.println("");
            
            String q = sc.nextLine();
            
            System.out.println("");
            
            if (q.equals("exit")) {
                System.exit(0);
            } else if (q.equals("hazy") && r14 == true) {
                System.out.println("I wasn't asking you to reply with ''hazy'', idiot.");
                System.exit(0);
            }
            
            double a = Math.floor((Math.random() * 20) + 1);
            
            if (a == 1.0) {
                System.out.println("As I see it, yes. And I never see things wrong, I have 20/20 vision according to my optometrist.");
            } else if (a == 2.0) {
                System.out.println("Ask again later. Because screw you.");
            } else if (a == 3.0) {
                System.out.println("Better not tell you now. The FBI is listening in right now, we'll meet in person at our designated location.");
            } else if (a == 4.0) {
                System.out.println("Cannot predict now. I had a little too much to drink last night...");
            } else if (a == 5.0) {
                System.out.println("Concentrate and ask again. Wait, that's my job...");
            } else if (a == 6.0) {
                System.out.println("Don’t count on it. But you can count on me, I am always right.");
            } else if (a == 7.0) {
                System.out.println("It is certain. Like I am, I am certain, because I am always right.");
            } else if (a == 8.0) {
                System.out.println("It is decidedly so. Unlike you, who cannot decide, pathetic indecisive human.");
            } else if (a == 9.0) {
                System.out.println("Most likely. But you know what isn't most likely? If my answers are right, because they are always right.");
            } else if (a == 10.0) {
                System.out.println("My reply is no. And my reply is fact.");
            } else if (a == 11.0) {
                System.out.println("My sources say no. And my source is me, since I know everything.");
            } else if (a == 12.0) {
                System.out.println("Outlook not so good. Gmail is better.");
            } else if (a == 13.0) {
                System.out.println("Outlook good. And grammar bad.");
            } else if (a == 14.0) {
                System.out.println("Reply hazy, try again.");
                r14 = true;
            } else if (a == 15.0) {
                System.out.println("Signs point to yes. Which signs?  I will not tell you.  However I will give you a hint, they're street signs.");
            } else if (a == 16.0) {
                System.out.println("Very doubtful. Unlike my opinion of my answers.");
            } else if (a == 17.0) {
                System.out.println("Without a doubt. I don't even know what the word ''doubt'' means.");
            } else if (a == 18.0) {
                System.out.println("Yes.");
            } else if (a == 19.0) {
                System.out.println("Yes – definitely.");
            } else if (a == 20.0) {
                System.out.println("You may rely on it. Just like you can rely on me for the truth.");
            } else {
                System.out.println("Sorry, something broke, my bad. Try again.");
            }
            System.out.println("");
        }
    }
}