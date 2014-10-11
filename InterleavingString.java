package leetcode.oj;

public class InterleavingString {
	public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length()) return false;
        if(s1.length()==0){
        	if(s2.equals(s3)) return true;
        	else return false;
        }
        if(s2.length()==0){
        	if(s1.equals(s3)) return true;
        	else return false;
        }
        String tep1=s1.substring(1);
    	String tep2=s2.substring(1);
    	String tep3=s3.substring(1);
        if(s1.charAt(0)==s3.charAt(0)&&s2.charAt(0)==s3.charAt(0)){
        	return isInterleave(tep1,s2,tep3)||isInterleave(s1,tep2,tep3);
        }
        if(s1.charAt(0)==s3.charAt(0))
        	return isInterleave(tep1,s2,tep3);
        if(s2.charAt(0)==s3.charAt(0))
        	return isInterleave(s1,tep2,tep3);
        return false;
    }
}
