public class Main {
    public static void main(String[] args) {
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
    }
}