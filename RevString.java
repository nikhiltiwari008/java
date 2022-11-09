public class RevString 
{
    
    public static void main(String[] args)  
    {
        String s="my name is Nikhil";
        String s1="";
        for(int i=s.length(); i>=0; i--)
        {
            s1=s1+s.charAt(i);
        }
         System.out.println(s1);
    }
}
