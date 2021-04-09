
public class Main {

    public static void main(String[] args) {

        HealthStation hospital = new HealthStation();

        Person edward = new Person("Edward", 30, 150, 77);
        Person tom = new Person("Tom", 33, 176, 85);

        System.out.println("weighings performed: " + hospital.weighings());

        hospital.weigh(edward);
        hospital.weigh(tom);

        System.out.println("weighings performed: " + hospital.weighings());
        
    }
}
