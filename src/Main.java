public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        int Age = 21;
        if (Age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        }
        if (Age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать!");
        }
        System.out.println(" ");
        System.out.println("Задача 2.");
        int Age2 = 21;
        if (Age2 >= 7 && Age2 < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (Age2 >= 18 && Age2 < 24) {
            System.out.println("Человек ходит в университет.");
        }
        if (Age2 >= 24) {
            System.out.println("Человек ходит на работу.");
        }
        System.out.println(" ");
        System.out.println("Задача 3.");
        int WagonCapacity = 102;
        int SeatPlace = 60;
        int StandingRoom = WagonCapacity - SeatPlace;
        int SeatsUsed = 33;
        int OthersUsed = 43;
        if (SeatsUsed < SeatPlace) {
            System.out.println("Есть еще " + (SeatPlace - SeatsUsed) + " сидячих мест.");
        }
        if (SeatsUsed == SeatPlace) {
            System.out.println("Сидячих мест нет.");
        }
        if (OthersUsed < StandingRoom) {
            System.out.println("Есть еще " + (StandingRoom - OthersUsed) + " стоячих мест.");
        }
        if (OthersUsed == StandingRoom) {
            System.out.println("Стоячих мест нет.");
        }
        System.out.println(" ");
        System.out.println("Задача 4.");
        int Age = 21;
        if (Age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать!");
        }
        System.out.println(" ");
        System.out.println("Задача 5.");
        int Age2 = 21;
        if (Age2 >= 7 && Age2 < 18) {
            System.out.println("Ребенок ходит в школу.");
        } else if (Age2 >= 18 && Age2 < 24) {
            System.out.println("Человек ходит в университет.");
        } else if (Age2 >= 24) {
            System.out.println("Человек ходит на работу.");
        }
        System.out.println(" ");
        System.out.println("Задача 6.");
        int WagonCapacity = 102;
        int SeatPlace = 60;
        int StandingRoom = WagonCapacity - SeatPlace;
        int SeatsUsed = 65;
        int OthersUsed = 31;
        if (SeatsUsed < SeatPlace) {
            System.out.println("Есть еще " + (SeatPlace - SeatsUsed) + " сидячих мест.");
        } else {
            System.out.println("Сидячих мест нет.");
        }
        if (OthersUsed < StandingRoom) {
            System.out.println("Есть еще " + (StandingRoom - OthersUsed) + " стоячих мест.");
        } else {
            System.out.println("Стоячих мест нет.");
        }
        System.out.println(" ");
        System.out.println("Задача 7.");
        int Age2 = 3;
        if (Age2 >= 2 && Age2 <= 6) {
            System.out.println("Если возраст человека равен " + Age2 + ", то ему нужно ходить в детский сад.");
        } else if (Age2 > 6 && Age2 <= 18) {
            System.out.println("Если возраст человека равен " + Age2 + ", то ему нужно ходить в школу.");
        } else if (Age2 > 18 && Age2 <= 24) {
            System.out.println("Если возраст человека равен " + Age2 + ", то ему нужно ходить в университет.");
        } else if (Age2 > 24) {
            System.out.println("Если возраст человека равен " + Age2 + ", то ему нужно ходить на работу.");
        }
        System.out.println(" ");
        System.out.println("Задача 8.");
        int Age2 = 10;
        if (Age2 < 5) {
            System.out.println("Ребенок не может кататься на аттракционе.");
        } else if (Age2 < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого.");
        } else {
            System.out.println("Ребенок может кататься без сопровождения взрослого.");
        }
        System.out.println(" ");
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