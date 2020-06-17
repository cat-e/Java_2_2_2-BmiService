public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float bmi = service.calculate(90, 180);
        System.out.println(bmi);

        float bmi1 = service.calculate(80, 180);
        System.out.println(bmi1);

        float bmiBigMass = service.calculate(200, 180);
        System.out.println(bmiBigMass);

        float bmiBigHeight = service.calculate(90, 220);
        System.out.println(bmiBigHeight);
    }
}