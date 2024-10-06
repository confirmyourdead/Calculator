import Utils.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean res = menu.mainMenu() ? menu.printMenu() : false;
        System.out.println(res);
    }
}