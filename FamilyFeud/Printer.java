public class Printer {
    private String one;
    private boolean onei;
    private String two;
    private boolean twoi;
    private String three;
    private boolean threei;
    private String four;
    private boolean fouri;
    private String five;
    private boolean fivei;
    private String six;
    private boolean sixi;
    private String seven;
    private boolean seveni;
    private String eight;
    private boolean eighti;
    private String name;
    private String namer;
    private int pc = 2;
    private int strike;
    private int strike2;
    private int p1;
    private int p2;
    private int c1;
    private int c2;
    private int c3;
    private int c4;
    private int c5;
    private int c6;
    private int c7;
    private int c8;
    private int d1;
    private int d2;
    private int lp;
    private int lv1;
    private int lv2;
    private String ps1;
    private String ps2;
    
    
    public Printer(String name, String namer){
        ps1 = "";
        ps2 = "";
        lv1 = 0;
        lv2 = 0;
        lp = 0;
        d1 = 0;
        d2 = 0;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        c6 = 0;
        c7 = 0;
        c8 = 0;
        p1 = 0;
        p2 = 0;
        strike = 0;
        strike2 = 0;
        this.name = name;
        this.namer = namer;
        one = "          ";
        onei = true;
        two = "          ";
        twoi = true;
        three = "          ";
        threei = false;
        four = "          ";
        fouri = false;
        five = "          ";
        fivei = false;
        six = "          ";
        sixi = false;
        seven = "          ";
        seveni = false;
        eight = "          ";
        eighti = false;
    }
    
    public String intro(){
        return "";
    }
    
    public static void clear(){
        System.out.println("\033[H\033[2J");
        //System.out.flush();
    }
    public String enter(){
        if(pc == 2){
            pc++;
            return "The question is:" + "\n" + "\n" + "**********************************" + "\n" + "* Most Popular Coding languages! *" + "\n" + "**********************************" + "\n" + "\n" + "Team " +name + " turn!";
        }
        if(pc % 2 == 0){
            
            
            pc++;
            
            return "Team " + name + " turn!";
            }
        else{
            
            pc++;
            
            return "Team " + namer + " turn!";
            }
        }
    
    public int setTwo(){
        return 4;
    }
    
    public String enterOne(){
        return "Team " + name + " turn!";
    }
    
    public String enterTwo(){
        return "Team " + namer + " turn!";
    }
    
    public int end(){
        if(c1 == 1 && c2 == 1 && c3 == 1 && c4 == 1 && c5 == 1 && c6 == 1 && c7 == 1 && c8 == 1){
            System.out.println("All answers guessed!");
            System.out.println();
            return 4;
        }
        else{
            return 0;
        }
    }
    
    public int gamer(String choice){
        
        
        if(choice.equalsIgnoreCase("Python") && c1 == 0){
            c1++;
            one = "  Python  ";
            if(pc % 2 == 0){
                p2+= 1000;
                System.out.println("That is the Number 1 answer! Team " + namer + " got 1000 points! Their total is now: " + p2);
                return 0;
            }
            else{
                p1+= 1000;
                System.out.println("That is the Number 1 answer! Team " + name + " got 1000 points! Their total is now: " + p1);
                return 0;
        }
        }
        
        if(choice.equalsIgnoreCase("C++") && c4 == 0){
            c4++;
            four = "   C++    ";
            if(pc % 2 == 0){ 
                p2+= 700;
                System.out.println("That is the Number 4 answer! Team " + namer + " got 700 points! Their total is now: " + p2);
                return 0;
                }
                else{
                    p1+= 700;
                    System.out.println("That is the Number 4 answer! Team " + name + " got 700 points! Their total is now: " + p1);
                    return 0;
                    
                } 
            
        }
        
        if(choice.equalsIgnoreCase("HTML") && c5 == 0){
            c5++;
            five = "   HTML   ";
            if(pc % 2 == 0){
                p2+= 600;
                System.out.println("That is the Number 5 answer! Team " + namer + " got 600 points! Their total is now: " + p2);
                return 0;
                }
                else{
                    p1+= 600;
                    System.out.println("That is the Number 5 answer! Team " + name + " got 600 points! Their total is now: " + p1);
                    return 0;
                    }
            }
        
        if(choice.equalsIgnoreCase("CSS") && c6 == 0){
            c6++;
            six = "   CSS    ";
            if(pc % 2 == 0){
                p2+= 500;
                System.out.println("That is the Number 6 answer! Team " + namer + " got 500 points! Their total is now: " + p2);
                return 0;
                }
                else{
                    p1+= 500;
                    System.out.println("That is the Number 6 answer! Team " + name + " got 500 points! Their total is now: " + p1);
                    return 0;
                    }
            
        }
        
        if(choice.equalsIgnoreCase("SQL") && c7 == 0){
            c7++;
            seven = "   SQL    ";
            if(pc % 2 == 0){
                p2+= 400;
                System.out.println("That is the Number 7 answer! Team " + namer + " got 400 points! Their total is now: " + p2);
                return 0;
                }
                else{
                    p1+= 400;
                    System.out.println("That is the Number 7 answer! Team " + name + " got 400 points! Their total is now: " + p1);
                    return 0;
                    }
            }
        
        if(choice.equalsIgnoreCase("Ruby") && c8 == 0){
            c8++;
            eight = "  Ruby    ";
            if(pc % 2 == 0){
                p2+= 300;
                System.out.println("That is the Number 8 answer! Team " + namer + " got 300 points! Their total is now: " + p2);
                return 0;
                }
                else{
                    p1+= 300;
                    System.out.println("That is the Number 8 answer! Team " + name + " got 300 points! Their total is now: " + p1);
                    return 0;
                    }
            
        }
        
        else if(choice.equalsIgnoreCase("Javascript") && c2 == 0){
            c2++;
            two = "Javascript";
            if(pc % 2 == 0){
                p2 += 900;
                System.out.println("That is the Number 2 answer! Team " + namer + " got 900 points! Their total is now: " + p2);
                return 0;
            }
            else{
                p1 += 900;
                System.out.println("That is the Number 2 answer! Team " + name + " got 900 points! Their total is now: " + p1);
                return 0;
            }
            
        }
        else if(choice.equalsIgnoreCase("Java") && c3 == 0){
            c3++;
            three = "   Java   ";
            if(pc % 2 == 0){
                p2 += 800;
                System.out.println("That is the Number 3 answer! Team " + namer + " got 800 points! Their total is now: " + p2);
                return 0;
            }
            else{
                p1+= 800;
                System.out.println("That is the Number 3 answer! Team " + name + " got 800 points! Their total is now: " + p1);
                return 0;
            }
        }
        else{
            if(pc % 2 == 0){
                System.out.println(choice + " is not an answer!");
                strike2++;
                ps2 = "";
                for(int u = 0; u < strike2; u++){
                    ps2 += "__  __   " ;
                }
                ps2 += "\n";
                for(int yu = 0; yu < strike2; yu++){
                    ps2 += "\\ \\/ /   ";
                }
                ps2 += "\n";
                for(int yi = 0; yi < strike2; yi++){
                    ps2 += " >  <    ";
                }
                ps2 += "\n";
                for(int yj = 0; yj < strike2; yj++){
                    ps2 += "/_/\\_\\   ";
                }
                System.out.println(ps2);
                
                if(strike2 >= 3){
                    System.out.println("\n" + namer + " is out!");
                }
                
                return strike2;
            }
            else{
                System.out.println(choice + " is not answer!");
                strike++;
                ps1 = "";
                
                for(int p = 0; p < strike; p++){
                    ps1 += "__  __   " ;
                }
                ps1 += "\n";
                for(int pu = 0; pu < strike; pu++){
                    ps1 += "\\ \\/ /   ";
                }
                ps1 += "\n";
                for(int pi = 0; pi < strike; pi++){
                    ps1 += " >  <    ";
                }
                ps1 += "\n";
                for(int pj = 0; pj < strike; pj++){
                    ps1 += "/_/\\_\\   ";
                    
                }
                
                System.out.println(ps1);
                if(strike >= 3){
                    System.out.println("\n" + name + " is out!");
                }
                return strike;
            }
        }
            
        
    }
    
    public int getPONE(){
        return p1;
    }
    public int getPTWO(){
        return p2;
    }
    
    public String winner(){
        String topbot = "*";
        if(p1 > p2){
            for(int i = 0; i < name.length(); i++){
                topbot += "*";
            }
            topbot += "******";
            return "**" + topbot + "\n" + "* " + name + " won! *" + "\n" + "**" + topbot;
        }
        else if(p1 < p2){
            for(int k = 0; k < namer.length(); k++){
                topbot += "*";
            }
            topbot += "******";
            return"**" + topbot + "\n" + "* " + namer + " won! *" + "\n" + "**" + topbot;
        }
        else{
            topbot = "**************";
            return topbot + "\n" + "* Game Tied! *" + "\n" + topbot;
        }
        
        
    }
    
    public String lightning(){
        return "Time for the lightning round!" + "\n" + "Each player will choose a number 1-20 and the player that is closest to a randomly generated number will go!";
    }
    
    public String findR(int one1, int two2, int r){
        if(one1 > r){
            d1 = one1 - r;
        }
        else if (r > one1){
            d1 = r - one1;
        }
        else{
            lp = 2;
            return name + " Guessed the number exactly!";
        }
        if(two2 > r){
            d2 = two2 - r;
        }
        else if( r > two2){
            d2 = r - two2;
        }
        else{
            lp = 1;
            return namer + " Guessed the number exactly";
        }
        
        if(d1 < d2){
            lp = 2;
            return "Number was " + r + "\n" + name + " goes first";
        }
        else{
            lp = 1;
            return "Number was " + r + "\n" + namer + " goes first";
        }
    }
    
    public String lgame(){
        if(lp <= 2){
            lp+= 2;
            return "The Question is: " + "\n" + "Most popular car brand in the US";
        }
        else if(lp % 2 == 0){
            lp++;
            return name + " turn!";
        }
        else if(lp % 2 == 1){
            lp++;
            return namer + " turn!";
        }
        else{
            return "";
        }
    }
    
    public String runLgame(String un, String tu){
        if(un.equalsIgnoreCase("Toyota")){
            lv1 = 5;
        }
        else if(un.equalsIgnoreCase("Honda")){
            lv1 = 4;
        }
        else if(un.equalsIgnoreCase("Ford")){
            lv1 = 3;
        }
        else if(un.equalsIgnoreCase("Lexus")){
            lv1 = 2;
        }
        else if(un.equalsIgnoreCase("Audi")){
            lv1 = 1;
        }
        else{
            lv1 = 0;
        }
        if(tu.equalsIgnoreCase("Toyota")){
            lv2 = 5;
        }
        else if(tu.equalsIgnoreCase("Honda")){
            lv2 = 4;
        }
        else if(tu.equalsIgnoreCase("Ford")){
            lv2 = 3;
        }
        else if(tu.equalsIgnoreCase("Lexus")){
            lv2 = 2;
        }
        else if(tu.equalsIgnoreCase("Audi")){
            lv2 = 1;
        }
        else{
            lv2 = 0;
        }
        if(lv1 > lv2){
            p1 += 750;
            return name + " had the best answer! They got 750 points. Their total is now: " + p1;
        }
        else if(lv2 > lv1){
            p2 += 750;
            return namer + " had the best answer! They got 750 points. Their total is now: " + p2;
        }
        else{
            return "Neither of those answers are valid!";
        }
    }
    // public void setOne(boolean hi){
    //     onei = hi;
    // }
    
    //public void setTwo(boolean bye){
        //twoi = bye;
    //}
    public void setA(){
        one = "  Python  ";
        two = "Javascript";
        three = "   Java   ";
        four = "   C++    ";
        five = "   HTML   ";
        six = "   CSS    ";
        seven = "   SQL    ";
        eight = "   Ruby   ";
        
    }
    
    public String toString(){
        return " ----------   ----------" + "\n" + "|" + one + "| |" + five + "|" + "\n" + " ----------   ----------" + "\n" + " ----------   ----------" + "\n" + "|" + two + "| |" + six + "|" + "\n" + " ----------   ----------" + "\n" + " ----------   ----------" + "\n" + "|" + three + "| |" + seven + "|" + "\n" + " ----------   ----------" + "\n" + " ----------   ----------" + "\n" + "|" + four + "| |" + eight + "|" + "\n" + " ----------   ----------";
        }

}
