public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 9.");
        int one = 131;
        int two = -342;
        int three = 5;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число: " + one);
            } else {
                System.out.println("Максимальное число: " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число: " + two);
            } else {
                System.out.println("Максимальное число: " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное число: " + one);
            } else if (three > one) {
                System.out.println("Максимальное число: " + three);
            } else {
                System.out.println("Числа равны");
            }
        }
    }
}