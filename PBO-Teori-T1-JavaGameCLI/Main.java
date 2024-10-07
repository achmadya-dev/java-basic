public class Main {
  public static void main(String[] args) {
    Player player1 = new Player("madya");

    player1.display();
    // System.out.println(player1.getName());

    // Farming
    player1.addExperience(25);
    player1.display();
    player1.addExperience(75);
    player1.display();

    Player player2 = new Player("ridwan");
    player2.display();
    player2.addExperience(200);
    player2.display();
  }
}
