class SwapWithoutVariable{
    public static void main(String[] args) {
        int a,b;
        a=98;
        b=18;
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println(a+"  "+b);
    }
}