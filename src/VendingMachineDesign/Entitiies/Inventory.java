package VendingMachineDesign.Entitiies;

public class Inventory {

    ItemShelf [] inventory;

    public Inventory( int size) {
        this.inventory = new ItemShelf[size];
        int startCode = 101;
        for(int index = 0; index < size; index++){
            ItemShelf itemShelf = new ItemShelf(startCode);
            startCode++;
            inventory[index] = itemShelf;
        }
    }

    public Item getItem(int productCode) throws Exception {

        for(ItemShelf itemShelf : inventory) {
            if (itemShelf.getProductCode() == productCode) {
                if (itemShelf.isAvailable())
                    return itemShelf.getItem();
                else {
                    System.out.println("Item not available");
                    throw new Exception("Item not available");
                }
            }
        }
        System.out.println("Cannot find itemshelf with the given product code");
        throw new Exception("Cannot find itemshelf with the given product code");
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }
}
