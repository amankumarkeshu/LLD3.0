package VendingMachineDesign.States;

import VendingMachineDesign.Entitiies.Item;
import VendingMachineDesign.Entitiies.VendingMachine;
import VendingMachineDesign.Enums.Coin;

import java.util.List;

public class IdleState implements State {
    public IdleState() {
        System.out.println("Currently at Idle state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        System.out.println("Clicked on insert coin button changing state to ready state");
        vendingMachine.setState(new ReadyState());

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("Insertion of coin not allowed");
    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception  {
        throw new Exception("Clicking on product Selection not allowed");

    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception  {
        throw new Exception("Selection of product not allowed");

    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productCode)throws Exception  {
        throw new Exception("Product dispense not alloweed");
    }

    @Override
    public int returnChange(VendingMachine vendingMachine, int difference)throws Exception  {
        throw new Exception("No change dispensed");
    }

    @Override
    public List<Coin> refundCoins(VendingMachine vendingMachine) throws Exception  {
        throw new Exception("No refund available");
    }
}
