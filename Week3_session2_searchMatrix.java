public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        
        int m = a.size();
        int n = 0;
        if(a.size() > 0 ) {
            n = a.get(0).size();
        }
        
        int start = 0;
        int end = m*n - 1;
        
        while(start <= end){
            int mid = ( start + end)/2;
            int midX = mid/n;
            int midY = mid % n;
            
            int num = a.get(midX).get(midY);
            if(num == b)
                return 1;
            
            
            if(num < b){
                start = mid +1;
            } else {
                end = mid-1;
            }
        }
        
        return 0;
    }    
}
