package Arrays.a;

public class Q23_Longest_Consecuent_seq {
    public static int longestSuccessiveElements(int []a) {
        int n = a.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(a[i]>a[j]){
                    int temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        int ans =1;
        int count=1;
        for(int i=0;i<n-1;i++){

            if(a[i+1]-a[i]==1){
                count++;
                ans=Math.max(ans, count);
            }
            else if (a[i + 1] != a[i]) {
                count=1;
            }

        }

        return ans;
    }
}
