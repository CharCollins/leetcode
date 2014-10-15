public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri=new ArrayList<List<Integer>>();
         if (numRows == 0) return tri;
        List<Integer> pre=new ArrayList<Integer>();
        pre.add(1);
        tri.add(pre);
        for(int i=2;i<=numRows;i++){
            List<Integer> cur=new ArrayList<Integer>();
            cur.add(1);
            for(int j=0;j<i-2;j++){
                int val=pre.get(j)+pre.get(j+1);
                cur.add(val);
            }
            cur.add(1);
            tri.add(cur);
            pre=cur;
        }
        return tri;
    }
}
