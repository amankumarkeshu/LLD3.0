package VendingMachineDesign.States;

import VendingMachineDesign.Entitiies.Item;
import VendingMachineDesign.Entitiies.VendingMachine;
import VendingMachineDesign.Enums.Coin;

import java.util.List;

public class Dispense implements State {

    public Dispense(VendingMachine vendingMachine, int productCode) throws Exception {

        dispenseProduct(vendingMachine, productCode);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Operation not allowed");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("Operation not allowed");

    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Operation not allowed");

    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("Operation not allowed");

    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        Item item = vendingMachine.getInventory().getItem(productCode);
        System.out.println("Item dispensed: " + item.getItemType().name());
        return item;
    }

    @Override
    public int returnChange(VendingMachine vendingMachine, int difference) throws Exception {
        throw new Exception("Operation not allowed");

    }

    @Override
    public List<Coin> refundCoins(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Operation not allowed");
    }
}
