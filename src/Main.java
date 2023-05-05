
public class Main {
    public static void main(String[] args) {
        //Fibonacci

        int f, f1 = 1, f2 = 2;
        for (int i = 0; i < 10; i++){
            f = f1 + f2;

            System.out.println(f);
            f1 = f2;
            f2 = f;
        }
    }
}