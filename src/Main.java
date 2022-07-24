public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 55;
        // weight в кг
        double height = 154;
        // height в cм
        double BMI = service.calculate(weight,height);
        System.out.println(BMI);
    }
}
