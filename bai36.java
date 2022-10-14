import java.util.HashSet;
import java.util.Set;

public class bai36 {
    class Solution {
        public static boolean isValidSudoku(char[][] board) {
            Set<String> s = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] == '.') {
                        continue;
                    }

                    int box = ((i / 3) * 3) + (j / 3);

                    int val = board[i][j];

                    String col = "col" + i + val;
                    String row = "row" + j + val;
                    String box1 = "box" + box + val;

                    if (s.contains(col) || s.contains(row) || s.contains(box1)) {
                        return false;
                    }

                    s.add(col);
                    s.add(row);
                    s.add(box1);
                }
            }
            return true;
        }

        public static void main(String[] args) {
            char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                    { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                    { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                    { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                    { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

            System.out.println(isValidSudoku(board));
        }
    }
}