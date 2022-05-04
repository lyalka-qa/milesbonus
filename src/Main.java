public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10500;
        int bonus = 1;

        int milesBonus = ticketPrice / 20 * bonus;
        System.out.println("Ваши бонусные мили составят:" + milesBonus);
    }
}
