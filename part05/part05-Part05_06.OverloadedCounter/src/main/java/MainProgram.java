
public class MainProgram {

    public static void main(String[] args) {
        
        Counter counter = new Counter(1);
        
        counter.increase(3);
        counter.decrease(2);
        
        System.out.println(counter.value());
        
    }
}