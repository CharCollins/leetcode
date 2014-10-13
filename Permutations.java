public class Permutations {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());
        for(int i=0;i<num.length;i++){
            ArrayList<ArrayList<Integer>> current=new ArrayList<ArrayList<Integer>>();
            for(ArrayList<Integer> l:result){
                for(int j=0;j<l.size()+1;j++){
                    //Add num[i] to index j
                    l.add(j,num[i]);
                    ArrayList<Integer> temp=new ArrayList<Integer>(l);
                    //Add new list to current
                    current.add(temp);
                    //delete element of index j, and and num[i] to index j+1 in next cycle
                    l.remove(j);
                }
            }
            result=new ArrayList<ArrayList<Integer>>(current);
        }
        return result;
    }
}
