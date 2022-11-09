public class PalindromeNo {
    public static void main(String[] args)
    {
        int n=12321, rev=0, rem;
        int temp=n;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        System.out.println(rev);
        if(rev==n)
        {
            System.out.println(n+" given number is palindrome");
        }
        else
        {
            System.out.println(n+"given number is not pallindrome");
        }
    }
}
