public class Ugly_Number {
    public static void main(String[] args){
        System.out.print(isUgly(6));
    }

    public static boolean isUgly(int num) {
        if(num==0)
            return false;
        if(num==1)
            return true;
        if(num%2!=0&&num%3!=0&&num%5!=0)
            return false;
        else{
            if(num==2||num==3||num==5)
                return true;
            else{
                if(num%2==0){
                    num=num/2;
                    return isUgly(num);
                }
                if(num%3==0){
                    num=num/3;
                    return isUgly(num);
                }
                if(num%5==0){
                    num=num/5;
                    return isUgly(num);
                }
                else return false;

            }
        }
    }
}
