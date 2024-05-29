import java.util.*;
public class powerof3 {
    public static void main(String args[])
    {
        float n=59049;
       
        while(n>1 && n%3==0)
        {
            n/=3;
        }
        if(n==1)
        System.out.println("right");
        else
        System.out.println("wrong");
    }
    
}
