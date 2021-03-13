import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Names person = new Names();

        System.out.println("Hello this is TIC-TAC-TOE game");

        System.out.println("Enter player1:");
        String player1 = scanner.next();
        person.setPlayer1(player1);
        System.out.println(person.getPlayer1());

        System.out.println("Enter player2:");
        String player2 = scanner.next();
        person.setPlayer2(player2);
        System.out.println(person.getPlayer2());

        System.out.println("So, OKAY LET's START OUR GAAAME!!!");

        TicTacToe tictactoe = new TicTacToe();


         Connection c = null;
         Statement stmt = null;

         try {
             Class.forName("org.postgresql.Driver");
             c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tic", "postgres", "Qazybek140403");
         }catch (Exception e) {
             e.printStackTrace();
             System.out.println(e.getClass().getName() + ": " + e.getMessage());
             System.exit(0);
         }
    }
}
