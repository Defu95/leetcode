public class Can_Place_Flowers {
    public static void main(String[] args){
//        int[] flowerbed = {1,0,0,0,1};
//        int[] flowerbed={0,0,1,0,1};
//        int[] flowerbed={0,1,0,1,0,0};
        int[] flowerbed={0,0};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
            return true;
        int flag=-1;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                flag=i;
                break;
            }
        }
        if(flag==-1&&n>0)
            return false;
        for(int i=flag;i<flowerbed.length;i++){
            int count=1;
            int j=i+1;
            for(;j<flowerbed.length;j++){
                if(flowerbed[j]==0)
                    count++;
                else
                    break;
            }
            if(i<flowerbed.length&&j==flowerbed.length)
                count++;
            if(i==0)
                count++;
            i=j;
            n-=(count-1)/2;
        }
        return n<=0? true : false;
    }
}
