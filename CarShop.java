
public class CarShop extends Shop implements IShop {

    public final static double SQUARE_CAR_SHOP = 300;
    public final static String COLOR_CAR = "BLUE";
    private String model;

    public CarShop(String name, String address, String model) {
        super(name, address);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CarShop carShop = (CarShop) o;

        return model.equals(carShop.model);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + model.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "CarShop{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public double getSquareShop() {
        return SQUARE_CAR_SHOP;
    }

    @Override
    public String getColorShop() {
        return COLOR_CAR;
    }
}
