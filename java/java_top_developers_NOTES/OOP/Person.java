package OOP;

class Person {
    double money = 0;
    public void setMoney(int money) {
        this.money = Double.parseDouble(String.valueOf(money));
    }
    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return this.money;
    }

    public double sumMoney(double... moneys) {
        double sum = 0;
        for(double mon : moneys) {
            sum += mon;
        }
        return sum;
    }
}
