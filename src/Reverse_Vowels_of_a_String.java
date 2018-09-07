public class Reverse_Vowels_of_a_String {
    public static void main(String[] args){
        String s=reverseVowels(".,");
        for(int i=0;i<s.length();i++)
            System.out.print(s.charAt(i)+" ");
    }
    public static String reverseVowels(String s) {
        int left=0,right=s.length()-1;
        char[] ch=s.toCharArray();
        while(left<right){
            while(!isVowels(ch[left])){
                if(left<s.length()-1)
                    left++;
                else break;
            }
//            if(left>right)
//                break;
            while(!isVowels(ch[right])){
                if(right>0)
                    right--;
                else break;
            }
            if(left>right)
                break;
            char tmp=ch[left];
            ch[left]=ch[right];
            ch[right]=tmp;
            left++;
            right--;
        }
        return new String(ch);
    }
    public static boolean isVowels(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            return true;
        return false;
    }
}
