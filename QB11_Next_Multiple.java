package Searching;

public class QB11_Next_Multiple {
    static int nextMultiple(int n, int m) {
        int div = n+1;
        while(div%m!=0){
            div++;
        }


        return div;

    }
}
