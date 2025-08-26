class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxdiag=0;
        int maxarea=0;
      for(int[] dim:dimensions){
        int l=dim[0];
        int w=dim[1];
        int digsq=l*l+w*w;
        int area=l*w;
        if(digsq>maxdiag){
            maxdiag=digsq;
            maxarea=area;
        }else if(digsq==maxdiag){
            maxarea=Math.max(maxarea,area);
        }
      }
        return maxarea;
      }
    
}
