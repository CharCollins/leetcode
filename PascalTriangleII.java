public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row=new ArrayList<Integer>();
        row.add(1);
        if(rowIndex==0) return row;
        for(int i=2;i<=rowIndex+1;i++){
            List<Integer> tmp=new ArrayList<Integer>();
            tmp.add(1);
            for(int j=0;j<row.size()-1;j++){
                tmp.add(row.get(j)+row.get(j+1));
            }
            tmp.add(1);
            row=tmp;
        }
        return row;
    }
}
