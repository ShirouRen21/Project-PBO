public class Driver {

    public static void main(String[] args) {
	Player player = new Player("Galih", 6.0, true, 250);
	GUI gui = new GUI(player);
	gui.startMenu();
    }
}
