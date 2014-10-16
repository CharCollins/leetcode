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
        /**
        if(x<0) return false;
        int div=1;
        while(x/div>=10) div*=10;
        while(x>0){
            int l=x/div;
            int r=x%10;
            if(l!=r) return false;
            x=x%div/10;
            div/=100;//首尾已经比较，故div小100倍
        }
        return true;
        */
    }
}
