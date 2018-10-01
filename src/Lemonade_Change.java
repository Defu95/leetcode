public class Lemonade_Change {
    public static void main(String[] args) {
        int[] bills={5,5,10,10,20};
//        int[] bills={10,10};
        System.out.print(lemonadeChange(bills));
    }

    public static boolean lemonadeChange(int[] bills) {
        int five=0,ten=0,twenty=0;
        for (int money : bills){
            if(money==5)
                five++;
            else if(money==10){
                ten++;
                if(five<1)
                    return false;
                else
                    five--;
            }else{
                twenty++;
                if(ten>=1){
                    ten--;
                    if(five>=1)
                        five--;
                    else return false;
                }else{
                    five-=3;
                    if(five<0)
                        return false;
                }
            }
        }
        return true;
    }
}
