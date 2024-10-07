import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();


        //1.Створіть масив цілих чисел з 20 елементами.
        int[] numbers = new int[20];
        System.out.println("1. " + numbers.length);

        //2.Заповніть масив випадковими цілими числами в діапазоні від -100 до 100.
        int[] range = new int[10];
        System.out.print("2.Випавдкові числа в діапазоні: ");
        for(int a = 0; a < range.length; a++){
            range[a] = random.nextInt(201) -100;
            System.out.print(range[a] + " ");
        }

        System.out.println(" ");

        //3.Знайдіть та виведіть суму всіх від'ємних чисел в масиві.
        int sum = 0;
        int[] rangeOne = new int[20];
        System.out.print("3.Сума від'ємних чисел: ");
        for(int b = 0; b < rangeOne.length; b++){
            rangeOne[b] = random.nextInt(201) -100;
            if(rangeOne[b] < 0) {
                sum += rangeOne[b];
            }
        }
        System.out.println(sum);

        //4.Знайдіть та виведіть кількість парних і непарних чисел в масиві.
        int evenCount = 0;
        int oddCount = 0;
        int[] rangeTwo = new int[10];

        for(int c = 0; c < rangeTwo.length; c++){
            rangeTwo[c] = random.nextInt(201) -100;
            if(rangeTwo[c] % 2 == 0) {
                evenCount++;
            }
            else{
                oddCount++;
            }
            }
        System.out.printf("4.Парні числа: %d Непарні числа: %d,\n", evenCount, oddCount);

        //5.Знайдіть найбільший та найменший елементи масиву та їхні індекси.
        int[] rangeThree = new int[15];
        int max = rangeThree[0];
        int min = rangeThree[0];
        int indexMax = 0;
        int indexMin = 0;
        for(int d = 0; d < rangeThree.length; d++){
            rangeThree[d] = random.nextInt(201) -100;
            if(max < rangeThree[d]){
                max = rangeThree[d];
                indexMax = d;
            }
            if(min > rangeThree[d]){
                min = rangeThree[d];
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
        int[] rangeFour = new int[25];

        for(int g = 0; g < rangeFour.length; g++) {
            rangeFour[g] = random.nextInt(201)-100;
            if (rangeFour[g] < 0 && !negative) {
                negative = true;
            } else if (negative) {
                suma += rangeFour[g];
                count++;
            }
        }

        if (count > 0) {
            double average = suma / count;
            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f\n", average);
        } else {
            System.out.println("У масиві немає від'ємних чисел або від'ємне число є останнім.");
        }

        }
    }

