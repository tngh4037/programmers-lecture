package z_challenges.exam;

// 안전지대 (지뢰)
public class SafeZone {

    public int solution(int[][] board) {
        int answer = 0;

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 1) {
                    drawDangerArea(board, row, col);
                }
            }
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }

    private void drawDangerArea(int[][] board, int row, int col) {
        // 지뢰가 있는 셀 기준으로, 해당 셀을 감싸고 있는 셀 중, 지뢰가 없는 지역에 한해서 위험지역(2) 세팅

        // 왼쪽 위 셀
        if (row - 1 >= 0 && col - 1 >= 0) {
            if (board[row - 1][col - 1] == 0) {
                board[row - 1][col - 1] = 2;
            }
        }

        // 위 셀
        if (row - 1 >= 0) {
            if (board[row - 1][col] == 0) {
                board[row - 1][col] = 2;
            }
        }

        // 오른쪽 위 셀
        if (row - 1 >= 0 && col + 1 < board[0].length) {
            if (board[row - 1][col + 1] == 0) {
                board[row - 1][col + 1] = 2;
            }
        }

        // 왼쪽 셀
        if (col - 1 >= 0) {
            if (board[row][col - 1] == 0) {
                board[row][col - 1] = 2;
            }
        }

        // 오른쪽 셀
        if (col + 1 < board[0].length) {
            if (board[row][col + 1] == 0) {
                board[row][col + 1] = 2;
            }
        }

        // 하단 왼쪽 셀
        if (row + 1 < board.length && col - 1 >= 0) {
            if (board[row + 1][col - 1] == 0) {
                board[row + 1][col - 1] = 2;
            }
        }

        // 하단 셀
        if (row + 1 < board.length) {
            if (board[row + 1][col] == 0) {
                board[row + 1][col] = 2;
            }
        }

        // 하단 오른쪽 셀
        if (row + 1 < board.length && col + 1 < board[0].length) {
            if (board[row + 1][col + 1] == 0) {
                board[row + 1][col + 1] = 2;
            }
        }
    }
}
