package VendingMachineDesign;

import VendingMachineDesign.Entitiies.Item;
import VendingMachineDesign.Entitiies.ItemShelf;
import VendingMachineDesign.Entitiies.VendingMachine;
import VendingMachineDesign.Enums.Coin;
import VendingMachineDesign.Enums.ItemType;
import VendingMachineDesign.States.State;

public class DriverVendingMachine {
    public static void main(String []args){
        try {

            int inventorySize = 10;
            // 1. Create a vending machine object
            VendingMachine vendingMachine = new VendingMachine(inventorySize);

            // 2. Populate inventory
            populateInventory(vendingMachine);

            // 3. Click on insert coin
            State currentState = vendingMachine.getState();
            currentState.clickOnInsertCoinButton(vendingMachine);

            // 4. Insert coin
            currentState = vendingMachine.getState();
            currentState.insertCoin(vendingMachine, Coin.TEN);
            currentState.insertCoin(vendingMachine, Coin.TEN);


            // 5. click on product selection button
            currentState = vendingMachine.getState();
            currentState.clickOnProductSelectionButton(vendingMachine);
            currentState = vendingMachine.getState();

            // 6. Select product and dispense prodduct & //7 . Return change
            currentState.selectProduct(vendingMachine, 101);




            // 8. Refund money


        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    private static void populateInventory(VendingMachine vendingMachine) {

        ItemShelf[] inventory = vendingMachine.getInventory().getInventory();
        int size  = inventory.length;

        for(int index =0; index < size; index++){
            if(index < 4) {
                Item item = new Item();
                item.setItemType(ItemType.PEPSI);
                item.setPrice(ItemType.PEPSI.getValue());
                inventory[index].setItem(item);
                inventory[index].setAvailable(true);
            } else if (index >= 4 && index <= 6) {
                Item item = new Item();
                item.setItemType(ItemType.LAYS);
                item.setPrice(ItemType.LAYS.getValue());
                inventory[index].setItem(item);
                inventory[index].setAvailable(true);
            } else {

                    Item item = new Item();
                    item.setItemType(ItemType.CHOCLATE);
                    item.setPrice(ItemType.CHOCLATE.getValue());
                    inventory[index].setItem(item);
                    inventory[index].setAvailable(true);
                }
            }
    }




}
