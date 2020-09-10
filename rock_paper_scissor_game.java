import java.util.*;
public class Main
{       
        static int player_point=0;
	    static int computer_point=0;
   static int rockpaperscissor(char player_choice,char computer_choice)
    {
        int flag=0;
        if(player_choice==computer_choice)
        {
           
            flag=0;
        }
        else if(player_choice=='r'&&computer_choice=='p')
        {
            
            flag=-1;
        }
        else if (player_choice=='p'&&computer_choice=='r'){
            
            flag=1;
        }
        
       else if(player_choice=='r'&&computer_choice=='s')
        {
            flag=1;
        }
       else if (player_choice=='s'&&computer_choice=='r')
        {
           flag=-1;
        }
       else if(player_choice=='s'&&computer_choice=='p')
        {
            flag=1;
        }
        else if (player_choice=='p'&&computer_choice=='s'){
           flag=-1;
        }
        return flag;
    }
    
	public static void main(String[] args) {
	    char play;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Do you want to play Rock Paper and Scissor game?");
	    System.out.println("Press'y' for yes and 'n' for no.");
	    char ch=s.next().charAt(0);   
	    if(ch=='y'||ch=='Y')
	    {
	    System.out.println("\nEnter Player Name");
	    String player=s.next();
	    
	    System.out.println("\nHello "+player + ".");
	    
	    do{
	    player_point=0;
	    computer_point=0;
	    System.out.println("\nEnter the match points");
	    
	    int match_points=s.nextInt();
	    
	    while((player_point<match_points)&&(computer_point<match_points))
	    {
	    System.out.println("\nEnter 'r' for rock , 'p' for paper and 's' for scissor.");
	  
	    char player_choice=s.next().charAt(0);    
	    String choices = "rps";
        Random rnd = new Random();
	    char computer_choice=choices.charAt(rnd.nextInt(choices.length()));
	    
	    System.out.println("\nComputer chooses "+ computer_choice);
	    int result=rockpaperscissor(player_choice,computer_choice);
	    
	    if(result==0)
	    {
	        System.out.println(" Draw");
	    }
	    else if(result==1)
	    {
	        System.out.println("\n"+player+" win this turn");
	        player_point=player_point+1;
	    }
	    else{
	        System.out.println("\nComputer win this turn");
	        computer_point=computer_point+1;
	    }
	    
	    System.out.println("\n"+player+" points : " +player_point);
	    System.out.println("Computer points : "+computer_point);
	    }
	    if(computer_point==match_points)
	    {
	        System.out.println("\nComputer wins the game.");
	        System.out.println("Bad luck next time " +player + ":(");
	    }
	    else
	    {
	        System.out.println("\n Hurraay!! you win the game :)");
	    }
	    System.out.println("\nDo you want To play Again? \nPress 'y' for yes and 'n' for no");
	    
	      play=s.next().charAt(0);   
	        
	    }while(play!='n');
	    
	    System.out.println("\n Thank You "+player+" for playing :)");
	    }
	    else
	    {
	        System.out.println("Thanks For Coming :)");
	    }
	  
	    
	}
}
