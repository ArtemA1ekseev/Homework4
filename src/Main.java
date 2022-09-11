public class Main {
    public static void main(String[] args) {
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
    }
}