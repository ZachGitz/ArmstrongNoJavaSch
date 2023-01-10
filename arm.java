import java.util.*;
public class Arm {

    public static void main (String args [])
    {
       Scanner sc = new Scanner(System.in);
       int origNo= sc.nextInt();
       int rem = 0,res = 0 ,orig2= 0 ; 
       int  digit = 0;
       orig2=origNo;
       int orig3=origNo;
       while(orig3!=0)
       {
        orig3 = orig3/10;
        ++digit;
        }
       while(origNo!=0)
       {
         rem = origNo % 10;
         res+= Math.pow(rem , digit);
         origNo = origNo / 10 ; 
       }
       if(res == orig2)
       {
           System.out.println("Armstrong Number");
       }
       else
       {
           System.out.println("NotArmstrong");
       }
       
       
    }
}
