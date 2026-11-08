class Solution {
    public boolean isValidSudoku(char[][] board) {

        // HashSets to track digits in each row, column and box
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        // Initialize all HashSets
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Traverse every cell in the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char num = board[i][j];

                // Ignore empty cells
                if (num == '.') {
                    continue;
                }

                // Find which 3x3 box the cell belongs to
                int boxIndex = (i / 3) * 3 + (j / 3);

                // Check for duplicates in row, column or box
                if (rows[i].contains(num) ||
                    cols[j].contains(num) ||
                    boxes[boxIndex].contains(num)) {

                    return false;
                }

                // Add the number to all three sets
                rows[i].add(num);
                cols[j].add(num);
                boxes[boxIndex].add(num);
            }
        }

        return true;
    }
}