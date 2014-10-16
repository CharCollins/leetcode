public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        if(s!=null&&!s.trim().equals("")){//排除s为空白字符的情况，像“ ”和“        ”
            String[] arr=s.split(" ");
            return arr[arr.length-1].length();
        }
        return 0;
        /**
        char[] arr=s.toCharArray();
        if(arr.length==0) return 0;
        int l=arr.length-1;
        while(l>=0&&arr[l]==' ') l--;//l>=0控制下标不越界
        int count=0;
        while(l>=0&&arr[l]!=' '){
            l--;count++;
        }
        return count;
        */
    }
}
