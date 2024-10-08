import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();


        //1.Створіть масив цілих чисел з 20 елементами.
        //2.Заповніть масив випадковими цілими числами в діапазоні від -100 до 100.
        int[] numbers = new int[20];
        for(int i =0; i < numbers.length; i++){
            numbers[i] = random.nextInt(201)-100;
        }
        System.out.print("Масив: ");
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();

        //3.Знайдіть та виведіть суму всіх від'ємних чисел в масиві.
        int sum = 0;
        System.out.print("3.Сума від'ємних чисел: ");
        for (int number : numbers) {
            if (number < 0) {
                sum += number;
            }
        }
        System.out.println(sum);

        //4.Знайдіть та виведіть кількість парних і непарних чисел в масиві.
        int evenCount = 0;
        int oddCount = 0;

        for(int number : numbers){
            if(number % 2 == 0) {
                evenCount++;
            }
            else{
                oddCount++;
            }
            }
        System.out.printf("4.Парні числа: %d Непарні числа: %d,\n", evenCount, oddCount);

        //5.Знайдіть найбільший та найменший елементи масиву та їхні індекси.
        int max = numbers[0];
        int min = numbers[0];
        int indexMax = 0;
        int indexMin = 0;
        for(int d = 0; d < numbers.length; d++){
            if(max < numbers[d]){
                max = numbers[d];
                indexMax = d;
            }
            if(min > numbers[d]){
                min = numbers[d];
                indexMin = d;
            }

        }
        System.out.printf("5.Найбільший елемент: %d(з індексом %d) \n" +
                "5.Найменший елемент масиву: %d(з індексом %d) \n", max, indexMax, min, indexMin);

        //6.Знайдіть і виведіть середнє арифметичне чисел, розташованих після першого від'ємного
        // числа у масиві (або повідомте, якщо від'ємних чисел немає).
        double suma = 0;
        int count = 0;
        boolean negative = false;

        for(int number : numbers) {
            if (number < 0 && !negative) {
                negative = true;
            } else if (negative) {
                suma += number;
                count++;
            }
        }

        if (count > 0) {
            double average = suma / count;
            System.out.printf("6.Середнє арифметичне чисел після першого від'ємного числа: %.2f\n", average);
        } else {
            System.out.println("У масиві немає від'ємних чисел або від'ємне число є останнім.");
        }

        }
    }

