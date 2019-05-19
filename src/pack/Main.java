interface Func<T> {
    T func ();
}
interface Arg1_Func<T> {
    T func (T t);
}
interface Arg1_Func2<T,T1> {
    T func (T1 t);
}
interface Arg2_Func<T,T1> {
    T func (T1 t1, T1 t2);
}

public class Main {

    public static void main(String[] args) {

        System.out.println("В этой функции используется обычное Лямбда-выражение. Результат выполнения функции: ");
        Func<Double> myNum = () -> Math.random() * 100;
        System.out.println("Случайное значение: " + myNum.func());
        System.out.println("Еще одно случайное значение: " + myNum.func());
        System.out.println("============================\n");

        System.out.println("В этой функции используется Лямбда-выражение, принимающее один аргумент. Результат выполнения функции: ");
        Arg1_Func2<Boolean, Integer> isEven = (n) -> (n % 2) == 0;
        if(isEven.func(10)){
            System.out.println("Число 10 четное");
        }
        System.out.println("============================\n");

        System.out.println("В этой функции используется Лямбда-выражение, принимающее два аргумента. Результат выполнения функции: ");
        Arg2_Func<Boolean, Integer> isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.func(10,2)) {
            System.out.println("Число 2 является множителем числа 10");
        }
        System.out.println("============================\n");

        System.out.println("В этой функции используется блочное Лямбда-выражение. Результат выполнения функции: ");
        Arg1_Func<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Факториал числа 5 равен " + factorial.func(5));
        System.out.println("============================\n");

    }
}

