package Splitwise.Expense.Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit{
    @Override
    public void validateSplitRequest(List<Split> splitList, double amount) {

        double checkAmount = 0;
        int countOfPersons = splitList.size();
        double equalSplitAmount =  (double) amount/countOfPersons;
        for(Split split: splitList) {
            checkAmount += split.getAmountOwe();
            if (split.getAmountOwe() != equalSplitAmount){
                System.out.println("This is an incorrect expense");
                System.out.println("Expected amount should have been " + equalSplitAmount + "but got a split amount as : " +
                        split.getAmountOwe());

            }
        }
        if (checkAmount == amount) {
            System.out.println("This is a correct expense");
        } else {
            System.out.println("This is an incorrect expense");
        }
    }
}
