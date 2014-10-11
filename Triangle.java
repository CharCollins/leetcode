package leetcode.oj;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
	public static int minimumTotal(List<List<Integer>> triangle) {
		int sum=0;
        for(List<Integer> a:triangle){
        	int small=a.get(0);
        	for(int i=0;i<a.size();i++){
        		if(a.get(i)<small) small=a.get(i);
        	}
        	sum+=small;
        }
        return sum;
    }
	
	public static void main(String args[]){
		//[-1],[2,3],[1,-1,-3]
		List<Integer> a1=new ArrayList<Integer>();
		List<Integer> a2=new ArrayList<Integer>();
		List<Integer> a3=new ArrayList<Integer>();
		a1.add(-1);
		a2.add(2);a2.add(3);
		a3.add(1);a3.add(-1);a3.add(-3);
		List<List<Integer>> t=new ArrayList<List<Integer>>();
		t.add(a1);t.add(a2);t.add(a3);
		System.out.println(minimumTotal(t));
	}
}
