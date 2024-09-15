package VendingMachineDesign.States;

import VendingMachineDesign.Entitiies.Inventory;
import VendingMachineDesign.Entitiies.Item;
import VendingMachineDesign.Entitiies.VendingMachine;
import VendingMachineDesign.Enums.Coin;

import java.util.List;

public class Selection implements State{

    public Selection() {
        System.out.println("Currently at Selection state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Operation not allowed");

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("Insert coin Operation not allowed");

    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception {

        throw new Exception("Click on product selection Operation not allowed");

    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception {

        List<Coin> coinList = vendingMachine.getCoinList();

        Inventory inventory = vendingMachine.getInventory();
        int totalAmount = 0;
        for(Coin coin : coinList) {
            totalAmount += coin.getValue();
        }

        Item item = inventory.getItem(productCode);
        if (item.getPrice() <= totalAmount) {
            vendingMachine.setState(new Dispense(vendingMachine, productCode));
            returnChange(vendingMachine, totalAmount- item.getPrice());
        } else {
            refundCoins(vendingMachine);
        }

    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw  new Exception("Operation not allowed");
    }

    @Override
    public int returnChange(VendingMachine vendingMachine, int difference) throws Exception {
        System.out.println("Returned change amount : " + difference);
        return difference;
    }

    @Override
    public List<Coin> refundCoins(VendingMachine vendingMachine) throws Exception {
        return vendingMachine.getCoinList();
    }
}
