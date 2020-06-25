public class GameLogic2 {

    String var[] = {"rock", "shears", "paper"};
    String randomVar = var [(int) (Math.random() * 3)];

    public void performing (String playerChoiсe) {

        if (randomVar.equals(playerChoiсe))
            System.out.println("Draw!");
        else if ((randomVar.equals(var[1]) && playerChoiсe.equals(var[2])) ||
                    (randomVar.equals(var[2]) && playerChoiсe.equals(var[3])) ||
                        (randomVar.equals(var[3]) && playerChoiсe.equals(var[1]))) {
            System.out.println(randomVar);
            System.out.println("The Computer wins!");
        }
        else
            System.out.println("The Player wins!");
    }
    public static void main(String[] args) {
        GameLogic2 player = new GameLogic2();
        player.performing("rock");
    }
}
