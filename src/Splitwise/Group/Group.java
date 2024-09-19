package Splitwise.Group;

import Splitwise.Expense.Expense;
import Splitwise.Expense.ExpenseController;
import Splitwise.Expense.ExpenseSplitType;
import Splitwise.Expense.Split.Split;
import Splitwise.User.User;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String groupId;
    String groupName;
    List<User> groupMembers;

    List<Expense> expenseList;

    ExpenseController expenseController;

    Group() {
        groupMembers = new ArrayList<>();
        expenseList = new ArrayList<>();
        expenseController = new ExpenseController();
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void addMember(User member) {
        groupMembers.add(member);
    }

    public String getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public List<User> getGroupMembers() {
        return groupMembers;
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }


    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser) {

        Expense expense = expenseController.createExpense(expenseId, paidByUser ,expenseAmount, description,  splitDetails, splitType);
        System.out.println("Creating an expense with the id : " + expenseId + ". The user who paid the amount is: " + paidByUser.getUserName() + "Total amount paid is : " + expenseAmount);
        expenseList.add(expense);
        return expense;
    }

}
