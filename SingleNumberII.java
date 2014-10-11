package leetcode.oj;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
	public static int singleNumber(int[] A) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
//		Map<String,String> map=new HashMap<String,String>();
		int unique=0;
        for(int i=0;i<A.length;i++){
        	System.out.println("A["+i+"]"+A[i]);
        	if(map.containsKey(A[i])){
        		int count=map.get(A[i]);
        		count++;
        		System.out.println("count"+count);
        		map.put(A[i], count);
        	}
        	else map.put(A[i], 1);
        }
        for(int i=0;i<map.size();i++){
        	System.out.println(map.get(i));
        	if(map.get(i)==1){
        		unique=map.get(i);
        		break;
        	}else return 0;
        }
        return unique;
    }
	
	public static void main(String[] args){
		int[] a={1,2,4,1,2,5,4,2,1,5,4,3,5};
		System.out.println(singleNumber(a));
	}
	
}
