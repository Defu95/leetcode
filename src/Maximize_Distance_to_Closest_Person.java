public class Maximize_Distance_to_Closest_Person {
    public static void main(String[] args){
//        int[] seats={0,0,1};
//        int[] seats={1,0,0,0,1,0,1};
        int[] seats={1,0,0,0};
//        int[] seats={0,1,0,1,0};

        System.out.print(maxDistToClosest(seats));
    }
    public static int maxDistToClosest(int[] seats) {
//        if(seats.length<=0)
//            return -1;
//        int n = seats.length, maxdist = 0;
//        int f1 = seats[0] == 1 ? 0 : -1;
//        for (int f2 = 1; f2 < n; f2++) {
//            if (seats[f2] == 1) {
//                if (f1 == -1) maxdist = f2;
//                else maxdist = Math.max(maxdist, (f2 - f1) / 2);
//                f1 = f2;
//            }
//        }
//        if (seats[n - 1] == 0) maxdist = Math.max(maxdist, n - 1 - f1);
//        return maxdist;
        int maxdistance=0,j=0,i=0,f1=-1;
        for(;i<seats.length;i++){
            if(seats[i]==0){
                for (j=i+1;j<seats.length;j++){
                    if(seats[j]!=0){
                        if(i==0)
                            maxdistance=j;
                        maxdistance=Math.max(maxdistance,(j-f1)/2);
                        f1=j;
                        break;
                    }
                }
                i=j;
            }else
                f1=i;
        }
        if(seats[seats.length-1]==0)
            maxdistance=Math.max(maxdistance,(j-f1-1));
        return maxdistance;
    }
}
