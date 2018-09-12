import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pascals_Triangle {
    public static void main(String[] args){
        List<List<Integer>> test=generate(2);
        Iterator<List<Integer>> it = test.iterator();
        while (it.hasNext()) {
            List<Integer> subtest=it.next();
            Iterator<Integer> t=subtest.iterator();
            while (t.hasNext())
                System.out.print(t.next());
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        if(numRows<=0){
            return res;
        }
        for(int i=0;i<numRows;i++){
            List<Integer> tmp=new ArrayList<>();
            tmp.add(1);
            for(int j=1;j<i;j++){
                tmp.add(list.get(j)+list.get(j-1));
            }
            if(i>=1)
                tmp.add(1);
            res.add(tmp);
            list=tmp;
        }
        return res;
    }
}
