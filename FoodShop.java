
public class FoodShop extends Shop implements IShop {

    public final static double SQUARE_FOOD_SHOP = 200;
    public final static String COLOR_FOOD_SHOP = "BLACK";
    private String type;

    public FoodShop(String name, String address, String type) {
        super(name, address);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        FoodShop foodShop = (FoodShop) o;

        return type.equals(foodShop.type);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "FoodShop{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public double getSquareShop() {
        return SQUARE_FOOD_SHOP;
    }

    @Override
    public String getColorShop() {
        return COLOR_FOOD_SHOP;
    }


}
