public class Poor_Pigs {
    public static void main(String[] args) {
        System.out.print(poorPigs(1000, 15, 60));
    }

    public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
//        int need_times=(int)Math.ceil(Math.log(buckets)/Math.log(2));
//        int epochs=(int)Math.ceil(minutesToTest/minutesToDie);
//        return (int)Math.ceil((need_times+(epochs*(epochs-1)/2))/epochs);
        //success
//        int dimision = (int) Math.floor(minutesToTest / minutesToDie) + 1;
//        return (int) Math.ceil(Math.log(buckets) / Math.log(dimision));

        int pig = 0;
        int onepigtest = (int) Math.floor(minutesToTest / minutesToDie) + 1;
        while (Math.pow(onepigtest, pig) < buckets) {
            pig++;
        }
        return pig;
    }
}
