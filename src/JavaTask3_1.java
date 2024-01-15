public class JavaTask3_1 {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int myBonus = service.price(10000);
        System.out.println(myBonus);
    }
}
