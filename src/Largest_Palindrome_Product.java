public class Largest_Palindrome_Product {
    public static void main(String[] args){
        System.out.print(largestPalindrome(8));
    }
    public static int largestPalindrome(int n) {
        if(n==1)
            return 9;
        int a=(int)Math.pow(10,n)-1;
        for(int i=a;i>a/10;i--){
            String s1=new StringBuffer(String.valueOf(i)).toString();
            String s2=new StringBuffer(s1).reverse().toString();
            s1+=s2;
            long num= Long.parseLong(s1);
            for(int j=a;j>a/10;j--){
                if(num/j>a)
                    break;
                if(num % j==0){
                    return (int)(num%1337);
                }
            }
        }
        return 0;
    }
}
