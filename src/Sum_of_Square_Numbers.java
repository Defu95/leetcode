public class Sum_of_Square_Numbers {
    public static void main(String[] agrs){
        System.out.print(judgeSquareSum(10000000));
    }
    public static boolean judgeSquareSum(int c) {
        for(int i=0;i<(int)Math.sqrt(c)+1;i++){
            for(int j=(int)Math.sqrt(c-i*i)-1;j<(int)(Math.sqrt(c-i*i))+1;j++){
                if(i*i+j*j==c)
                    return true;
            }
        }
        return false;
    }
}
