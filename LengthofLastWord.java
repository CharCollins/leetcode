public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        if(s!=null&&!s.trim().equals("")){//排除s为空白字符的情况，像“ ”和“        ”
            String[] arr=s.split(" ");
            return arr[arr.length-1].length();
        }
        return 0;
    }
}
