import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pascals_Triangle_II {
    public static void main(String[] args){
        List<Integer> test=getRow(5);
        Iterator<Integer> it=test.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        if(rowIndex<=0)
            return res;
        for(int i=0;i<=rowIndex;i++){
            List<Integer> tmp=new ArrayList<>();
            tmp.add(1);
            for(int j=1;j<i;j++)
                tmp.add(res.get(j)+res.get(j-1));
            if(i>=1)
                tmp.add(1);
            res=tmp;
        }
        return res;
    }
}
