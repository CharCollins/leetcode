package leetcode.oj;

import java.util.StringTokenizer;
import java.util.ArrayList;
public class ReverseWords {
	 public static String reverseWords(String s) {
	        String[] ss=s.split("\\s+");
	        if(ss.length==0) return "";
	        StringBuilder sb=new StringBuilder();
	        sb.append(ss[ss.length-1]);
	        for(int i=ss.length-2;i>=0;--i){
	        	if(!ss[i].isEmpty())
	        		sb.append(" ").append(ss[i]);
	        }
	        return sb.toString();
	    }
    
    public static void main(String args[]){
    	System.out.println(reverseWords("\"   a   b  c d   e  \""));
    	
    }
}