public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 5.");
        int Age2 = 21;
        if (Age2 >= 7 && Age2 < 18) {
            System.out.println("Ребенок ходит в школу.");
        } else if (Age2 >= 18 && Age2 < 24) {
            System.out.println("Человек ходит в университет.");
        } else if (Age2 >= 24) {
            System.out.println("Человек ходит на работу.");
        }
    }
}