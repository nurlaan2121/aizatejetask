import java.util.Scanner;

public class TennisGame {
    private int player1Score = 0;
    private int player2Score = 0;

    public static void main(String[] args) {
        TennisGame game = new TennisGame();
        game.startGame();
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру Теннис!");

        while (!isGameFinished()) {
            System.out.println("\nСчет: Игрок 1 - " + getScoreDescription(player1Score) +
                    ", Игрок 2 - " + getScoreDescription(player2Score));
            System.out.println("Введите номер игрока (1 или 2), чтобы ударить мяч: ");

            int playerNumber = scanner.nextInt();
            hitBall(playerNumber);
        }

        scanner.close();
    }

    private void hitBall(int playerNumber) {
        if (playerNumber == 1) {
            player1Score++;
        } else if (playerNumber == 2) {
            player2Score++;
        } else {
            System.out.println("Ошибка: Введите 1 или 2 для выбора игрока.");
        }
    }

    private String getScoreDescription(int score) {
        switch (score) {
            case 0:
                return "Ноль";
            case 1:
                return "П quince";
            case 2:
                return "Тридцать";
            case 3:
                return "Сорок";
            default:
                return "Ошибка";
        }
    }

    private boolean isGameFinished() {
        if (player1Score >= 4 && player1Score - player2Score >= 2) {
            System.out.println("Игрок 1 победил!");
            return true;
        } else if (player2Score >= 4 && player2Score - player1Score >= 2) {
            System.out.println("Игрок 2 победил!");
            return true;
        } else if (player1Score == 3 && player2Score == 3) {
            System.out.println("Деюсь, это даже!");
            return true;
        }
        return false;
    }
}
