package VendingMachineDesign.Enums;

public enum ItemType {

    LAYS(10),
    PEPSI(15),
    CHOCLATE(20);

    int value;

    ItemType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
