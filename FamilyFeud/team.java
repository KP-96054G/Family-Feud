public class team {
    private String t1n1;
    private String t1n2;
    private String t1n3;
    private String t1n4;
    private String t2n1;
    private String t2n2;
    private String t2n3;
    private String t2n4;
    private int cn;
    public team(String t1n1, String t1n2, String t1n3, String t1n4, String t2n1, String t2n2, String t2n3, String t2n4){
        cn = 1;
        this.t1n1 = t1n1;
        this.t1n2 = t1n2;
        this.t1n3 = t1n3;
        this.t1n4 = t1n4;
        this.t2n1 = t2n1;
        this.t2n2 = t2n2;
        this.t2n3 = t2n3;
        this.t2n4 = t2n4;
    }
    public String turn(){
        if(cn == 1){
            cn++;
            return t1n1;
        }
        else if(cn == 2){
            cn++;
            return t2n1;
        }
        else if(cn == 3){
            cn++;
            return t1n2;
        }
        else if(cn == 4){
            cn++;
            return t2n2;
        }
        else if(cn == 5){
            cn++;
            return t1n3;
        }
        else if(cn == 6){
            cn++;
            return t2n3;
        }
        else if(cn == 7){
            cn++;
            return t1n4;
        }
        else{
            cn = 1;
            return t2n4;
        }
    }
    
    public String turn1(){
        if(cn == 1){
            cn+= 2;
            return t1n1;
        }
        else if(cn == 3){
            cn +=2;
            return t1n2;
        }
        else if(cn == 5){
            cn += 2;
            return t1n3;
        }
        else{
            cn = 1;
            return t1n4;
        }
    }
    
    public String turn2(){
        if(cn == 2){
            cn+= 2;
            return t2n1;
        }
        else if(cn == 4){
            cn += 2;
            return t2n2;
        }
        else if(cn == 6){
            cn+= 2;
            return t2n3;
        }
        else{
            cn = 2;
            return t2n4;
        }
        
        
        
        
        
        
        
    }
}