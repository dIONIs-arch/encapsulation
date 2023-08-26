public class InfoCargo {
    private final Dimensions dimensions;
    private final int weight;
    private final String deliveryAddress;
    private final boolean mayFlip;
    private final String registrationNumber;
    private final boolean isFragile;
    public InfoCargo(Dimensions dimensions, int weight, String deliveryAddress, boolean mayFlip, String registrationNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.mayFlip = mayFlip;
        this.registrationNumber = registrationNumber;
        this.isFragile = isFragile;
    }
    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean getisMayFlip() {
        return mayFlip;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean getisFragile() {
        return isFragile;
    }

    public InfoCargo setDimensions(Dimensions dimensions) {
        return new InfoCargo(dimensions, weight, deliveryAddress, mayFlip, registrationNumber, isFragile);
    }
    public InfoCargo setWeight(int weight) {
        return new InfoCargo(dimensions, weight, deliveryAddress, mayFlip, registrationNumber, isFragile);
    }
    public InfoCargo setDeliveryAddress(String deliveryAddress) {
        return new InfoCargo(dimensions, weight, deliveryAddress, mayFlip, registrationNumber, isFragile);
    }
    public InfoCargo setMayFlip(boolean mayFlip) {
        return new InfoCargo(dimensions, weight, deliveryAddress, mayFlip, registrationNumber, isFragile);
    }
    public InfoCargo setRegistrationNumber(String registrationNumber) {
        return new InfoCargo(dimensions, weight, deliveryAddress, mayFlip, registrationNumber, isFragile);
    }
    public InfoCargo setIsFragile(boolean isFragile) {
        return new InfoCargo(dimensions, weight, deliveryAddress, mayFlip, registrationNumber, isFragile);
    }

    public void showInfoCargo() {
        System.out.println("Информация о товаре " + "\n" +
                "Объем: " + dimensions.volume() + "\n" +
                "Масса: " + weight + "\n" +
                "Адрес доставки: " + deliveryAddress + "\n"
                );
    }











}
