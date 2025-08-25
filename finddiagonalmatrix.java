class Sol {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int row = 0, col = 0;
        int[] ans = new int[m * n];

        for(int i = 0; i < m * n; i++){
            ans[i] = mat[row][col];
            if((row + col) % 2 == 0){
                if(col == n - 1) row++;
                else if(row == 0) col++;
                else {
                    row--;
                    col++;
                }
            }
        
            else{
                if(row == m - 1) col++;
                else if(col == 0) row++;
                else{
                    row++;
                    col--;
                }

            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Sol sol = new Sol();
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] result = sol.findDiagonalOrder(mat);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
