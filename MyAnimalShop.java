import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

public class MyAnimalShop implements AnimalShop{
    private double balance ;
    ArrayList<Animal> AnimalList = new ArrayList<>();
    ArrayList<Customer> CustomersList = new ArrayList<>();
    ArrayList<Customer> CustomersListToday = new ArrayList<>();
    LocalTime closetime = LocalTime.of(22,30);
    private double store = 0;
    private double buycost = 0;
    private int ruaTimes = 0;
    private boolean isRunning;
    Random random = new Random();

    @Override
    public void buy(Animal a) throws InsufficientBalanceException{
        //买入猫猫，要在猫咪列表中添加，
        //如果店内余额不足，抛出异常 InsufficientBalanceException .
        if (balance< a.getPrice()){
            throw new InsufficientBalanceException ();
        } else {
            buycost = buycost+a.getPrice();
            balance -= a.getPrice();
            AnimalList.add(a);
            System.out.println("成功购入一只"+a.getKind()+",取名为："+a.getName());
        }
    }final

    @Override
    public void serve(Customer p, Animal a) throws AnimalNotFoundException {
        System.out.print("顾客"+p.name+"访店。");
        this.isRunning = p.arrivalTime.isBefore(closetime);
        //若店内没有小动物，抛出 AnimalNotFoundException.
        if (AnimalList.isEmpty()){
            throw new AnimalNotFoundException();
        } else if (!this.isRunning){
            System.out.println("但门店已经打烊，顾客"+p.name+"离开。");
            System.out.println("=======================");
        } else {
            //if (CatList.isEmpty()==false&&p.arrivalTime.isBefore(closetime)){
            p.Arrival();
            System.out.println("想买小动物："+a.toString());
            //接受客户参数 在顾客列表中加入新顾客
            CustomersList.add(p);
            if (p.arrival.equals(LocalDate.now())){
                CustomersListToday.add(p);
            }

            //卖出小动物
            if (p.wantBuy){
                if (p.buy(a)){
                    balance += a.getStorePrice();
                    store += a.getStorePrice();
                    p.cash -= a.getStorePrice();
                    AnimalList.remove(a);
                    System.out.println(p.name+"购买成功。");
                }else {
                    System.out.println("Can't effort it,failed.");
                }
            }else {
                System.out.println(p.name+"不购买小动物。");
            }

            //rua服务
            if (p.wantRua && !AnimalList.isEmpty()){
                    balance += 15;
                    p.cash -= 15;
                    ruaTimes++;
            }else if (!p.wantRua){
                System.out.println(p.name+"不rua小动物。");
            }else{
                throw new AnimalNotFoundException();
            }

            //顾客离开
            p.leave(LocalTime.now());
        }
        System.out.println("门店余额："+balance);
    }

    @Override
    public void close() {

        if (closetime.equals(LocalTime.now())){
            System.out.println(closetime+"。猫咖打烊。");
        }
        //LocalDate判断

        //输出当天光顾的顾客列表信息，
        if (CustomersListToday.isEmpty()){
            System.out.println("今日无顾客光顾");
        }else {
            System.out.println("今日光顾的客户信息："+CustomersListToday);
        }

        //计算并输出一天的利润（用rua猫次数计算）
        double profit = store+((ruaTimes)*15)-this.buycost;
        System.out.println("店内现余额为："+balance);
        if (profit>=0){
            System.out.println("今日盈利："+profit);
        } else {
            System.out.println("今日亏损："+(0-profit));
        }
        System.out.println("=====================");

    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Animal> getAnimalList() {
        return AnimalList;
    }

    public ArrayList<Customer> getCustomersList() {
        return CustomersList;
    }

    public ArrayList<Customer> getCustomersListToday() {
        return CustomersListToday;
    }

    public LocalTime getClosetime() {
        return closetime;
    }

    public double getBuycost() {
        return buycost;
    }

    public int getRuaTimes() {
        return ruaTimes;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public double getStore() {
        return store;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnimalList(ArrayList<Animal> animalList) {
        AnimalList = animalList;
    }

    public void setCustomersList(ArrayList<Customer> customersList) {
        CustomersList = customersList;
    }

    public void setCustomersListToday(ArrayList<Customer> customersListToday) {
        CustomersListToday = customersListToday;
    }

    public void setClosetime(LocalTime closetime) {
        this.closetime = closetime;
    }

    public void setBuycost(double buycost) {
        this.buycost = buycost;
    }

    public void setRuaTimes(int ruaTimes) {
        this.ruaTimes = ruaTimes;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void setStore(double store) {
        this.store = store;
    }
}
