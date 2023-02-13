public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount = sum;
        System.out.println("На вашем счету: " + sum + " сом.");
    }
    public void withDraw(int summ) throws LimitException{
        if (summ < amount){
                throw new LimitException("Недостаточно средств", amount);
        }else {
            amount = amount - summ;
            System.out.println("Вдано: " + summ + " сом");
        }
    }
}
