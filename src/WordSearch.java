import java.util.*;
public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCEG";
        System.out.println(exist(board,word));

    }
    public static  boolean exist(char[][] board, String word) {
        int Row = board.length;
        int Col = board[0].length;

        Set<String> path = new HashSet<>();

        for(int i=0;i<Row;i++){
            for(int j=0;j<Col;j++){
                if(dfs(board,word,i,j,0,path)){
                    return true;
                }
            }
        }
          return false;


    }
    private static boolean dfs(char[][] board,String word,int r,int c, int i,Set<String> path){
        int Row = board.length;
        int Col = board[0].length;

        if(i==word.length()) return true;

        if(r<0 || c<0 || r>=Row || c>=Col || word.charAt(i)!= board[r][c] || path.contains(r + "," + c)){
            return false;
        }
        path.add(r + "," + c);
        boolean res = (dfs(board,word,r+1,c,i+1,path))
                     || (dfs(board,word,r-1,c,i+1,path))
                     || (dfs(board,word,r,c+1,i+1,path))
                     || (dfs(board, word, r, c-1, i+1, path));

        path.remove(r + "," + c);
        return res;

    }
}
