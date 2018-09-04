public class Valid_Palindrome_II {
    public static void main(String[] args){
        System.out.print(validPalindrome("ab"));

    }
    public static boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        boolean r1=true,r2=true;
        while (i!=j&&(i+1)!=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                i++;
                r1=isValid(s,i,j);
                i--;j--;
                r2=isValid(s,i,j);
                break;
            }
        }
        return r1||r2;
    }
    public static boolean isValid(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left)!= s.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }
}
