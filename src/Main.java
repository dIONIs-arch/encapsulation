import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(2, 3, 4);
        InfoCargo infoCargo = new InfoCargo(dimensions, 5,"Москва", false, "555", true);
        infoCargo.showInfoCargo();

        InfoCargo infoCargo1 = infoCargo.setDeliveryAddress("Санкт-Петербург");
        infoCargo1.showInfoCargo();

        Dimensions dimensions2 = dimensions.setLength(1);
        InfoCargo infoCargo2 = new InfoCargo(
                dimensions2,
                10,
                infoCargo1.getDeliveryAddress(),
                infoCargo1.getisMayFlip(),
                infoCargo1.getRegistrationNumber(),
                infoCargo1.getisFragile());


        infoCargo2.showInfoCargo();
        infoCargo.showInfoCargo();

        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.println("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }
}