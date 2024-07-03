import java.util.*;
class task1{
    public static void main(String[] args)
    {
     Scanner s=new Scanner(System.in);
     Random r=new Random();
     int random_no;
     int guess_no;
     boolean choice=true;
     while(choice)
     {
     random_no=r.nextInt(100)+1;
     //System.out.println(random_no);
     for(int i=0;i<5;i++)
     {
        System.out.println("You have "+(5-i)+" chances");
        System.out.println("Enter your guess");
        guess_no=s.nextInt();
        if(guess_no==random_no)
        {
            System.out.println("Your guess is correct");
            System.out.println("Your score is"+(5-i)*10);
            break;
        }
        else if(guess_no>random_no)
        {
            System.out.println("Your guess is too high,try again");
        }
        else if(guess_no<random_no)
        {
            System.out.println("Your guess is too low,try again");
        }
        //!last chance//
        if(i==4&&guess_no!=random_no)
        {
         System.out.println("You lose,try again");   
        }
    }
    System.out.println("Do you want to play again?(true/false)");
    choice=s.nextBoolean();
    System.out.println("End of while");
    }
    s.close();
}
}