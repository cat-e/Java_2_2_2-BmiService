public class BmiService {

    public float calculate(float mass, float height) {
//        float mass = 90;
//        float height = 180;
        float bmi = mass / (height * height/10_000);
        return bmi;


    }
}
