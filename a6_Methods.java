class a6_ps5{
    public void gameplay(){
        System.out.println("Playing Game");
    }
    public String whichgame(int number){
        if(number>10) return "Game" ; 
        return "Not a Game" ; 
    }
}

public class a6_Methods{
    public static void main(String args[]){
        a6_ps5 ps = new a6_ps5() ; 
        ps.gameplay();
        System.out.println(ps.whichgame(1));
    }
}