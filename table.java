import java.util.Scanner;

public class table {
     public static void main(String[] args) {
        int a; 
        System.out.print("enter number to generate table");  //foe taking input from user
        Scanner Obj=new Scanner(System.in);      
        a=Obj.nextInt();
         int i=0;
        for(i=1; i<11; i++)
        {
            System.out.println(a+"*"+i+"="+a*i);
        }
     }
        
    }

