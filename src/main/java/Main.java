import ru.netology.Ints;
import ru.netology.IntsCalculator;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println("Результат суммы: " + intsCalc.sum(2, 2));
        System.out.println("Результат умножения: " + intsCalc.mult(10, 22));
        System.out.println("Результат разности: " + intsCalc.sub(5, 2));
        System.out.println("Результат деления: " + intsCalc.div(10, 2));
        System.out.println("Результат возведения в степень: " + intsCalc.pow(2, 10));
    }
}