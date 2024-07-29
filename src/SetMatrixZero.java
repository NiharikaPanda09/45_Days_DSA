import java.util.*;
public class SetMatrixZero {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        SetMatrixZero obj = new SetMatrixZero();
        obj.setZeroes(matrix);
        for(int[]row : matrix){
            System.out.println(Arrays.toString(row));
        }

    }
    public static void setZeroes(int[][] matrix) {
    int[] row = new int[matrix.length];
    int[] col = new int[matrix[0].length];

    for(int i=0;i<matrix.length;i++){
        row[i] = 0;
    }
    for(int j=0;j<matrix[0].length;j++){
        col[j] = 0;
    }

    for(int i=0;i<matrix.length;i++){
        for(int j =0;j<matrix[0].length;j++){
            if(matrix[i][j] == 0){
                row[i] = 1;
                col[j] = 1;
            }
        }
    }

    for(int i=0;i<row.length;i++){
        for(int j =0;j<col.length;j++){
            if (row[i] == 1 || col[j] == 1){
                matrix[i][j] = 0;
            }
        }
    }

    }
}
