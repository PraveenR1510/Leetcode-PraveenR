// Last updated: 9/11/2026, 10:05:31 AM
1import java.util.HashSet;
2
3class Solution {
4    public boolean isValidSudoku(char[][] board) {
5        HashSet<String> seen = new HashSet<>();
6
7        for (int i = 0; i < 9; i++) {
8            for (int j = 0; j < 9; j++) {
9                char c = board[i][j];
10                if (c != '.') {
11                    if (!seen.add(c + " in row " + i) ||
12                        !seen.add(c + " in col " + j) ||
13                        !seen.add(c + " in box " + i / 3 + "-" + j / 3)) {
14                        return false;
15                    }
16                }
17            }
18        }
19
20        return true;
21    }
22}