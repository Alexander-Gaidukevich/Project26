public class ClothesShop extends Shop implements IShop {

    public final static double SQUARE_CLOTHES_SHOP = 100;
    public final static String COLOR_SHOP = "RED";

    private String marca;

    public ClothesShop(String name, String address, String marca) {
        super(name, address);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ClothesShop that = (ClothesShop) o;

        return marca.equals(that.marca);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + marca.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ClothesShop{" +
                "marca='" + marca + '\'' +
                '}';
    }

    @Override
    public double getSquareShop() {
        return SQUARE_CLOTHES_SHOP;
    }

    @Override
    public String getColorShop() {
        return COLOR_SHOP;
    }
}
