import java.util.Scanner;

public class OmokGame {
    private static final int BOARD_SIZE = 19;
    private static final char BLACK_STONE = '●';
    private static final char WHITE_STONE = '○';
    
    private char[][] board = new char[BOARD_SIZE][BOARD_SIZE];
    private boolean isBlackTurn = true;
    
    public OmokGame() {
        // 오목판 초기화
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }
    
    public void printBoard() {
        // 오목판 출력
        System.out.print("  \t");
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print((char) ('A' + i) + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < BOARD_SIZE; j++) {
            	if(j == 0)
            		System.out.print("\t");
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean isGameOver = false;
        
        // 게임 시작
        System.out.println("오목 게임을 시작합니다.");
        while (!isGameOver) {
            // 오목판 출력
            printBoard();
            
            // 플레이어 입력 받기
            System.out.println((isBlackTurn ? "●" : "○") + " 차례입니다. 돌을 놓을 좌표를 입력하세요 (예: A1): ");
            String input = scanner.nextLine();
            if (input.length() != 2) {
                System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                continue;
            }
            
            // 좌표 계산
            int row = Character.getNumericValue(input.charAt(1)) - 1;
            int col = input.charAt(0) - 'A';
            if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE) {
                System.out.println("잘못된 좌표입니다. 다시 시도해주세요.");
                continue;
            }
            
            // 돌 놓기
            if (board[row][col] != '-') {
                System.out.println("이미 돌이 놓여있습니다. 다시 시도해주세요.");
            continue;
        }
        board[row][col] = isBlackTurn ? BLACK_STONE : WHITE_STONE;
        
        // 승리 조건 체크
        if (checkWin(row, col)) {
            isGameOver = true;
            System.out.println((isBlackTurn ? "●" : "○") + " 플레이어가 승리하였습니다!");
            printBoard();
        } else {
            // 턴 종료
            isBlackTurn = !isBlackTurn;
        }
    }
    
    scanner.close();
}

private boolean checkWin(int row, int col) {
    char stone = board[row][col];
    
    // 가로 체크
    int count = 0;
    for (int i = 0; i < BOARD_SIZE; i++) {
        if (board[row][i] == stone) {
            count++;
            if (count == 5) {
                return true;
            }
        } else {
            count = 0;
        }
    }
    
    // 세로 체크
    count = 0;
    for (int i = 0; i < BOARD_SIZE; i++) {
        if (board[i][col] == stone) {
            count++;
            if (count == 5) {
                return true;
            }
        } else {
            count = 0;
        }
    }
    
    // 대각선 체크
    count = 0;
    for (int i = -4; i <= 4; i++) {
        int r = row + i;
        int c = col + i;
        if (r >= 0 && r < BOARD_SIZE && c >= 0 && c < BOARD_SIZE && board[r][c] == stone) {
            count++;
            if (count == 5) {
                return true;
            }
        } else {
            count = 0;
        }
    }
    
    // 역대각선 체크
    count = 0;
    for (int i = -4; i <= 4; i++) {
        int r = row - i;
        int c = col + i;
        if (r >= 0 && r < BOARD_SIZE && c >= 0 && c < BOARD_SIZE && board[r][c] == stone) {
            count++;
            if (count == 5) {
                return true;
            }
        } else {
            count = 0;
        }
    }
    
    return false;
}

public static void main(String[] args) {
    OmokGame game = new OmokGame();
    game.play();
}
}