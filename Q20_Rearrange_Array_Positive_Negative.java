package Arrays.a;
import java.util.*;
public class Q20_Rearrange_Array_Positive_Negative {

    public static int[] alternateNumbers(int []a) {
        int n = a.length;

        ArrayList<Integer> listp= new ArrayList<>();
        ArrayList<Integer> listn= new ArrayList<>();

        for(int i=0;i<n;i++){
            if(a[i]>=0){
                listp.add(a[i]);
            }else{
                listn.add(a[i]);
            }
        }
        int pIndex=0;
        int nIndex=0;
        for(int j=0;j<n;j++){
            if(j%2==0&&pIndex<listp.size()){

                a[j]=listp.get(pIndex);
                pIndex++;
            }
            else if(nIndex<listn.size()){

                a[j]=listn.get(nIndex);
                nIndex++;


            }
        }

        return a;
    }
}
