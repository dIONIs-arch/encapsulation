public class Elevator {
    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;

    Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? (currentFloor - 1) : currentFloor;
        System.out.println(currentFloor + " этаж");
    }
    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? (currentFloor + 1) : currentFloor;
        System.out.println(currentFloor + " этаж");
    }
    public void move(int floor) {
        if (floor >= minFloor && floor <= maxFloor){
            if (currentFloor < floor) {
                while (currentFloor != floor) {
                    moveUp();
                }
            } else if (currentFloor > floor) {
                while (currentFloor != floor) {
                    moveDown();
                }
            }
        } else {
            System.out.println("Такого этажа нет");
        }


    }



}
