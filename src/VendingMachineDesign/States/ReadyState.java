package VendingMachineDesign.States;

import VendingMachineDesign.Entitiies.Item;
import VendingMachineDesign.Entitiies.VendingMachine;
import VendingMachineDesign.Enums.Coin;

import java.util.List;

public class ReadyState implements State{

    public ReadyState() {
        System.out.println("Currently at REady state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Operation not allowed");

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        vendingMachine.getCoinList().add(coin);
        System.out.print("Added coin of value : " + coin.getValue() + " to my vending machine");

    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception {

        vendingMachine.setState(new Selection());

    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception {

    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        return null;
    }

    @Override
    public int returnChange(VendingMachine vendingMachine,  int difference) throws Exception {
        return 0;
    }

    @Override
    public List<Coin> refundCoins(VendingMachine vendingMachine) throws Exception {
        return null;
    }
}
