import java.util.Arrays;

/**
 * Created by Dmitriy on 19.11.2016.
 */
public class HW5 {
    public static void main(String[] args) {
        System.out.println("Hello World");


        isOne();
        isTwo();
        isThree();
        isFour();
        isFive();
        isSix();
        seven();
        //seven2();
       int arr5[] = {8, 2, 19, 90, 64, 876};

        isEventA(arr5);
        isEventB(arr5);
        isEventV(arr5);
        isEventG(arr5);
        isEventD(arr5);


    }

    public static void isOne() {

        for (int i = 15; i <= 25; i++) {

            System.out.println(i);

        }
    }

    public static void isTwo() {
        System.out.println("Вывести на экран убывающую последовательность нечетных чисел в интервале от 33 до 15:");
        for (int i = 33; i >= 15; i = i - 2) {
            System.out.println(i);
        }
    }
//Написать программу для вывода на экран всех элементов массива строк через запятую.

    public static void isThree() {
        String[] arr = {"Index0", "Index1", "Index2", "Index3"};
        for (int i = 0; i < arr.length; i++) {
          //  System.out.print(arr[i]);
        }
        System.out.println(Arrays.asList(arr[3]));
        System.out.println(Arrays.toString(arr));

    }
//Написать программу для вывода на экран всех элементов массива чисел в обратном порядке.

    public static void isFour() {
        int arr[] = new int[10];
        for (int i = arr.length; i >= 0; i--) {
            System.out.print(i + " ");
            System.out.println(" ");
        }
    }

    public static void isFive() {
        System.out.println("вывода на экран всех элементов массива чисел в обратном порядке: ");
        int arr2[] = new int[20];
        for (int i = 5; i < arr2.length; i = i + 3) {
            arr2[i] = i * 2;

            System.out.println(arr2[i] + " ");
        }


    }
//Написать программу для заполнения массива чисел из 10 элементов значениями переменной а, при условии что а является членом арифметической прогрессии 2а-1, а1=4.
    public static void isSix() {
        int arr2[] = new int[10];
        arr2[0]=4;
        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = arr2[i-1]*2-1;

        }
        System.out.println(" заполнения массива чисел из 10 элементов значениями переменной а: "+Arrays.toString(arr2));
    }
//Выяснить, верно ли, что сумма элементов массива есть неотрицательное число, используя тернарный оператор.

    public static void seven() {
        int arr4[] = {4, 8, 10};
        int sum = 0;
        for (int i = 0; i < arr4.length; i++) {
            sum += arr4[i];


        }
        boolean prov = (sum >= 0) ? true : false;
        System.out.println(prov);
        System.out.println(sum);
    }

//    public static void seven2() {
//        int arr4[] = {14, 28, 110};
//        int sum = arr4[0] + arr4[1] + arr4[2];
//        boolean prov = (sum >= 0) ? true : false;
//        System.out.println(prov);
//    }
    /*Дан массив чисел. Используя тернарный оператор определить:
    а) максимальный элемент;
    б) минимальный элемент;
    в) на сколько максимальный элемент больше минимального;
    г)  индекс максимального элемента;
    д) индекс минимального и индекс максимального элементов.*/
    public static void isEventA(int arr5[]) {
        //   int arr5[]={8,2,19,90,64};
        int max = 0;
        for (int i = 0; i < arr5.length; i++)
            max = max > arr5[i] ? max : arr5[i];
        System.out.println("максимальный элемент: "+max);
    }

    public static void isEventB(int arr5[]) {
        //   int arr5[]={8,2,19,90,64};
        int min = arr5[0];
        for (int i = 0; i < arr5.length; i++)
            min = min < arr5[i] ? min : arr5[i];
        System.out.println("минимальный элемент: "+min);
    }

    public static void isEventV(int arr5[]) {
        //   int arr5[]={8,2,19,90,64};
        int  max = 0;
        int min = arr5[0];
        int raznost;
        for (int i = 0; i < arr5.length; i++)
            max = max > arr5[i] ? max : arr5[i];

        for (int i = 0; i < arr5.length; i++)
            min = min < arr5[i] ? min : arr5[i];

        raznost = max - min;
        System.out.println("максимальный элемент больше минимального на "+raznost);
    }
    public static void isEventG(int arr5[]) {

        int maxElement = arr5.length;
        int maxIndex = 0;
        for (int i = 0; i < arr5.length; i++) {
            maxElement = maxElement > arr5[i] ? maxElement : arr5[i];
            maxIndex = maxElement > arr5[i] ? maxIndex : (maxIndex = i);

        }
        System.out.println("индекс максимального элемента: " + maxIndex);

    }

    public static void isEventD(int arr5[]) {
        int minElement =  arr5[0];
        int minIndex = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            minElement = minElement < arr5[i] ? minElement : arr5[i];
            minIndex = minElement < arr5[i] ? minIndex : (minIndex=i);
        }
        System.out.println("индекс минимального элемента: " + minIndex);
    }
}








