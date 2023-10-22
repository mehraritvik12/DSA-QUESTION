package Searching;

public class Q02_Search_in_String {



    static int SearchChar (String str, char target ){
        if(str.length()==0){
            return -1;
        }

        for(int i=0;i<str.length();i++){
           if(str.charAt(i)==target){
               return i;
           }
        }
        return -1;
    }

    public static void main(String[] args) {

        String str = "Ritvik";
        char target = 'v';
        System.out.println(SearchChar(str,target));
    }
}
