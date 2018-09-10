import java.util.HashMap;

public class Can_Place_Flowers {
    public static void main(String[] args){

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
            int lock=-1,count=1;
            if(flowerbed[i]==0){
                if(lock==1)
                    count++;
                else{
                    lock=1;
                    flag=i;
                }
            }

        }

    }
}
