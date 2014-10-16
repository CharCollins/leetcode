public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int result=0;
        int no=x;
        while(no>0){
            int m=no%10;
            no=no/10;
            result=result*10+m;
        }
        return x==result;
    }
}
