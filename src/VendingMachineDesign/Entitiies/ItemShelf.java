package VendingMachineDesign.Entitiies;

public class ItemShelf {

    int productCode;

    Item item;

    boolean isAvailable;

    public ItemShelf(int productCode) {
        this.productCode = productCode;
        this.isAvailable = false;
    }

    public int getProductCode() {
        return productCode;
    }

    public Item getItem() {
        return item;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
