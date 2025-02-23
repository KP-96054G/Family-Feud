import java.util.Scanner;
public class Family
{
    @SuppressWarnings("static-access")
    public Family()
    {   
        boolean rep = true;
        while(rep){
        int d1 = 0;
        int d2 = 0;
        int random = 0;
        int s1 = 0;
        int s2 = 0;

        Scanner in = new Scanner(System.in);
        intro intr = new intro();
        String enter = in.nextLine();
        intr.clr();
        System.out.println("Welcome!");
        System.out.println("Enter team one name: ");
        String t1 = in.nextLine();
        System.out.print("Enter team " + t1 + " member one: ");
        
        String n1 = in.nextLine();
        System.out.print("Enter team " + t1 + " member two: ");
        String n2 = in.nextLine();
        System.out.print("Enter team " + t1 + " member three: ");
        String n3 = in.nextLine();
        System.out.print("Enter team " + t1 + " member four: ");
        String n4 = in.nextLine();
        
        System.out.println();
        System.out.println("Enter team two name: ");
        
        
        String t2 = in.nextLine();
        System.out.print("Enter team " + t2 + " member one: ");
        String n5 = in.nextLine();
        System.out.print("Enter team " + t2 + " member two: ");
        String n6 = in.nextLine();
        System.out.print("Enter team " + t2 + " member three: ");
        String n7 = in.nextLine();
        System.out.print("Enter team " + t2 + " member four: ");
        String n8 = in.nextLine();
        
        team teams = new team(n1, n2, n3, n4, n5, n6, n7, n8);
        
        intr.clr();
        
        Printer game = new Printer(t1, t2);
        System.out.println();
        System.out.println(game.enter());
        System.out.println(game);
        int v = 2;
        while(s1 < 3 && s2 < 3){
            System.out.println(teams.turn() + " What is your guess?");
            String c = in.nextLine();
            intr.clr();
            if(v % 2 == 0){
                v++;
                s1 = game.gamer(c);
            }
            else{
                v++;
                s2 = game.gamer(c);
            }
            if(s1 < 3 && s2 < 3){
                
                System.out.println(game);
            }
            else{
                System.out.println();
            }
            s1 += game.end();
            if(s1 != 4){
                System.out.println(game.enter());
            }
            else{
                s2 = game.setTwo();
            }
            
        }
        //System.out.println("um");
        while(s1 < 3 && s2 >= 3){
           //System.out.println("no!");

           System.out.println(teams.turn1() + " What is your guess?");
           String c = in.nextLine();
           intr.clr();
           s1 = game.gamer(c);
           if(s1 < 3 && s2 >= 3){
            
            System.out.println(game);
            s1 += game.end();
            if(s1 < 3 && s2 >= 3){
                System.out.println(game.enterOne());
            }
           }
           else{
            System.out.println(); 
           }
        }
        //System.out.println("YAY!");
        while(s1 >= 3 && s2 <  3){
            //System.out.println("yes!");
            System.out.println(teams.turn2() + " What is your guess?");
            String c = in.nextLine();
            intr.clr();
            s2 = game.gamer(c);
            if(s1 >= 3 && s2 < 3){
                
                System.out.println(game);
                s2 += game.end();
                if(s1 >= 3 && s2 < 3){
                    System.out.println(game.enterTwo());
                }
            }
            else{
                System.out.println();
            }
            
        }
        System.out.println();
        System.out.println("First round over!");
        int total1 = game.getPONE();
        int total2 = game.getPTWO();
        System.out.println(t1 + " had " + total1 + " points");
        System.out.println(t2 + " had " + total2 + " points");
        System.out.println();
        //System.out.println(game.winner());
        //System.out.println();
        System.out.println("Final Board: ");
        game.setA();
        System.out.println(game);
        System.out.println("\n" + "\n");
        System.out.println(game.lightning());
        System.out.print("Team " + t1 + " pick a number: ");
        int num1 = in.nextInt();
        System.out.print("Team " + t2 + " pick a number: ");
        int num2 = in.nextInt();
        random = (int)(Math.random() * 20 + 1);
        intr.clr();
        System.out.println(game.findR(num1, num2, random));
        System.out.println(game.lgame());
        System.out.println(game.lgame());
        String l1 = in.nextLine();
        String l2 = in.nextLine();
        System.out.println(game.lgame());
        String l3 = in.nextLine();
        intr.clr();
        System.out.println(game.runLgame(l2, l3));
        total1 = game.getPONE();
        total2 = game.getPTWO();
        System.out.println();
        System.out.println("Final Marks:" + "\n" + t1 + ": " + total1 + "\n" + t2 + ": " + total2);
        System.out.println();
        System.out.println(game.winner());
        System.out.println("Thanks for playing!");
        System.out.println();
        System.out.println("Press enter to play again");
        String again = in.nextLine();
        if(again.equals("")){
            rep = true;
            intr.clr();
        }
        else{
            rep = false;
            break;
        }
        }
        
        
    }
}