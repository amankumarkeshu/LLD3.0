package VendingMachineDesign.Entitiies;

import VendingMachineDesign.Enums.Coin;
import VendingMachineDesign.States.IdleState;
import VendingMachineDesign.States.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    State state;
    Inventory inventory;
    List<Coin> coinList;

    public VendingMachine(int size) {
        state = new IdleState();
        coinList = new ArrayList<>();
        inventory = new Inventory(size);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
