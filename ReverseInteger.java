package leetcode.oj;

public class ReverseInteger {
	public static int reverse(int x) {
		boolean mark=x>0?false:true;//positive digit is false
        x=x>0?x:-x;
        int result=0;
        while(x>=10){
            result=result*10+x%10;
            x=x/10;
        }
        result=result*10+x;
        return !mark?result:-result;
        /**
        boolean mark=x>0?false:true;//positive digit is false
        x=x>0?x:-x;
        int result=0;
        while(x>=10){
            result=result*10+x%10;
            x=x/10;
        }
        result=result*10+x;
        if(result>2147483647||(mark&&result)>2147483647) return 0;
        return !mark?result:-result;
         * */
    }
	
	public static void main(String args[]){
		System.out.println(reverse(-10));
	}
}
