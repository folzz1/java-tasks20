import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        //Задача 1
//        System.out.println("Введите число");
//        int n = Integer.parseInt(bf.readLine());
//        if(n%2==0) System.out.println("Число чётное");
//        else System.out.println("Число нечётное");
//
//
//        //Задача 2
//        System.out.println("Введите три числа ");
//        String str = bf.readLine();
//        String[] numbers = str.split(" ");
//        int num1 = Integer.parseInt(numbers[0]);
//        int num2 = Integer.parseInt(numbers[1]);
//        int num3 = Integer.parseInt(numbers[2]);
//
//        int min = Math.min(num1, Math.min(num2, num3));
//        System.out.println("Минимальное число: " + min);
//
//
//        //Задача 3
//        for(int i=1;i<=10;i++){
//            for(int j=1;j<=10;j++)
//                System.out.print(j*i + "\t");
//            System.out.println();
//        }
//
//
//
//        //Задача 4
//        System.out.println("Введите число");
//        int n1 = Integer.parseInt(bf.readLine());
//        int s = (n1*(n1+1))/2;
//        System.out.println("Сумма всех чисел от 1 до N = "+s);



//        //Задача 5
//        System.out.println("Введите число N");
//        int n2 = Integer.parseInt(bf.readLine());
//
//        int a = 0, b = 1;
//        System.out.print("Первые N чисел Фибоначчи: ");
//        for (int i = 0; i < n2; i++) {
//            System.out.print(a + " ");
//            int next = a + b;
//            a = b;
//            b = next;
//        }



//        //Задача 6
//        System.out.println("Введите целое число");
//        int n = Integer.parseInt(bf.readLine());
//        boolean o = true;
//        if (n <= 1) {
//            o = false;
//        } else {
//            for (int i = 2; i < n; i++) {
//                if (n % i == 0) {
//                    o = false;
//                    break;
//                }
//            }
//        }
//        if (o) {
//            System.out.println(n + " является простым числом");
//        } else {
//            System.out.println(n + " не является простым числом");
//        }



        //Задача 7
//        System.out.println("Введите целое число");
//        int n = Integer.parseInt(bf.readLine());
//        for(int i=n;i>0;i--){
//            System.out.print(i+" ");
//        }



        //Задача 8
//        System.out.println("Введите два числа ");
//        String str = bf.readLine();
//        String[] numbers = str.split(" ");
//        int A = Integer.parseInt(numbers[0]);
//        int B = Integer.parseInt(numbers[1]);
//        int ans = 0;
//        for (; A <= B; A++) {
//            if (A % 2 == 0) {
//                ans += A;
//            }
//        }
//        System.out.println("Сумма четных чисел " + ans);
//

        //Задача 9
//        System.out.println("Введите строку ");
//        String str = bf.readLine();
//        String ans = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            ans += str.charAt(i);
//        }
//        System.out.println(ans);




//        //Задача 10
//        System.out.println("Введите целое число");
//        String str = bf.readLine();
//        int ans = 0;
//        for (int i = str.length() - 1; i >= 0; i--) {
//            ans ++;
//        }
//        System.out.println(ans);


//        //Задача 11
//        System.out.println("Введите целое число");
//        long n = Long.parseLong(bf.readLine());
//        long ans = 1;
//        for(long i=1; i<=n; i++)
//            ans *= i;
//        System.out.println("Факториал: "+ans);



        //Задача 12
//        System.out.println("Введите целое число ");
//        String str = bf.readLine();
//        int ans = 0;
//        for (int i = str.length() - 1; i >= 0; i--) {
//            ans += Character.getNumericValue(str.charAt(i));
//        }
//        System.out.println("Сумма цифр в числе "+ans);





        //Задача 13
//        System.out.println("Введите строку ");
//        String str = bf.readLine();
//        String o = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            o += str.charAt(i);
//        }
//        if (str.equals(o)) {
//            System.out.println("Строка - палиндромом.");
//        } else {
//            System.out.println("Строка - не палиндромом.");
//        }
//




        //Задача 14
//        System.out.println("Введите числа, где первое - размер массива, остальные - массив ");
//        String str = bf.readLine();
//        String[] numbers = str.split(" ");
//        int A = Integer.parseInt(numbers[0]);
//        int ans = 0;
//        for(int i = 1;i<numbers.length;i++){
//            int temp = Integer.parseInt(numbers[i]);
//            if(ans<temp){
//                ans = temp;
//            }
//        }
//        System.out.println(ans);




//        //Задача 15
//
//        System.out.println("Введите числа, где первое - размер массива, остальные - массив ");
//        String str = bf.readLine();
//        String[] numbers = str.split(" ");
//        int A = Integer.parseInt(numbers[0]);
//        int ans = 0;
//        for(int i = 1;i<numbers.length;i++){
//            int temp = Integer.parseInt(numbers[i]);
//            ans += temp;
//        }
//        System.out.println(ans);



        //Задача 16
//        System.out.println("Введите числа, где первое - размер массива, остальные - массив ");
//        String str = bf.readLine();
//        String[] numbers = str.split(" ");
//        int A = Integer.parseInt(numbers[0]);
//        int pol = 0;
//        int otr = 0;
//        for(int i = 1;i<numbers.length;i++){
//            int temp = Integer.parseInt(numbers[i]);
//            if (temp > 0)
//                pol++;
//            else if (temp < 0)
//                otr++;
//
//        }
//        System.out.println("Количество положительных чисел = "+pol);
//        System.out.println("Количество отрицательных чисел = "+otr);





        //Задача 17
//        System.out.println("Введите два числа ");
//        String str = bf.readLine();
//        String[] numbers = str.split(" ");
//        int A = Integer.parseInt(numbers[0]);
//        int B = Integer.parseInt(numbers[1]);
//
//        System.out.println("Простые числа в диапазоне: ");
//        for (int i = A; i <= B; i++) {
//            boolean o = true;
//            if (i <= 1) {
//                o = false;
//            } else {
//                for (int j = 2; j < i; j++) {
//                    if (i % j == 0) {
//                        o = false;
//                        break;
//                    }
//                }
//            }
//            if (o) {
//                System.out.print(i + " ");
//            }
//        }






        //Задача 18
//        System.out.println("Введите строку");
//        String str = bf.readLine();
//        int gl = 0;
//        int sog = 0;
//        String gl1 = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
//
//        for (char b : str.toCharArray()) {
//            if (gl1.indexOf(b) != -1) {
//                gl++;
//            } else if (Character.isLetter(b)) {
//                sog++;
//            }
//        }
//        System.out.println("Количество гласных - " + gl);
//        System.out.println("Количество согласных - " + sog);







        //Задача 19
//        System.out.println("Введите слова");
//        String str = bf.readLine();
//        String[] sl = str.split(" ");
//        for(int i = sl.length-1;i>=0;i--)
//            System.out.print(sl[i]+" ");
//
//







        //Задача 20

//        System.out.println("Введите число ");
//        String str = bf.readLine();
//        int num = Integer.parseInt(str);
//        int check = 0;
//        for(int i = 0;i<str.length();i++){
//            check +=  Math.pow(Character.getNumericValue(str.charAt(i)), str.length());
//        }
//
//        if(check == num)
//            System.out.println("число "+num+" является числом Армстронга");
//        else
//            System.out.println("число "+num+" не является числом Армстронга");
    }
}