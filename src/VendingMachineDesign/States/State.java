package VendingMachineDesign.States;

import VendingMachineDesign.Entitiies.Item;
import VendingMachineDesign.Entitiies.VendingMachine;
import VendingMachineDesign.Enums.Coin;

import java.util.List;

public interface State {

    public void clickOnInsertCoinButton( VendingMachine vendingMachine) throws Exception;

    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;

    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception;

    public void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception;

    public Item dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception;

    public int returnChange(VendingMachine vendingMachine, int difference) throws Exception;

    public List<Coin> refundCoins(VendingMachine vendingMachine) throws Exception;

}
