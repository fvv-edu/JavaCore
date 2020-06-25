public class GameLogic {

    String var[] = {"rock", "shears", "paper"};
    String randomVar = var [(int) (Math.random() * 3)];

    public void performing (String playerChoiсe) {

        if (randomVar.equals(playerChoiсe)) {
            System.out.println("Computer chooses " + randomVar);
            System.out.println("Player chooses " + playerChoiсe);
            System.out.println("Draw!");
        }
        else if ((randomVar.equals("rock") && playerChoiсe.equals("shears")) ||
                    (randomVar.equals("shears") && playerChoiсe.equals("paper")) ||
                        (randomVar.equals("paper") && playerChoiсe.equals("rock"))) {
            System.out.println("Computer chooses " + randomVar);
            System.out.println("Player chooses " + playerChoiсe);
            System.out.println("The Computer wins!");
        }
        else {
            System.out.println("Computer chooses " + randomVar);
            System.out.println("Player chooses " + playerChoiсe);
            System.out.println("The Player wins!");
        }
    }
   /* public static void main(String[] args) {
        GameLogic player = new GameLogic();
        player.performing("rock");
    }*/
}
