import java.time.LocalDate;
import java.time.LocalTime;

public class Customer {

    String name;
    int visit = 0;
    LocalDate arrival = LocalDate.now();
    LocalTime arrivalTime = LocalTime.now();
    int cash;
    boolean wantBuy;
    boolean wantRua;



    public Customer(String name,int visit,LocalDate arrival,LocalTime arrivalTime,int cash,boolean wantBuy,boolean wantRua){
        this.name = name;
        this.visit = visit;
        this.arrival = arrival;
        this.arrivalTime = arrivalTime;
        this.cash = cash;
        this.wantBuy = wantBuy;
        this.wantRua = wantRua;
    }

    public Customer(String name,int visit){
        this.name = name;
        this.visit = visit;
    }

    public void Arrival(){
        visit++;
        System.out.println(this.toString());
    }

    public boolean buy(Animal a){
        System.out.println( "顾客"+this.name+"想领养小动物："+a.toString());
        if (this.cash>= a.getStorePrice()){
            return  true;
        }else {
            return false;
        }
    }

    public boolean rua(Animal a){
        System.out.println( "顾客"+this.name+"想rua小动物："+a.toString());
        return true;
    }

    public void leave(LocalTime leaveTime){
        System.out.println("顾客"+this.name+"在"+leaveTime+"离开。");
    }

    @Override
    public String toString() {
        return "顾客"+this.name+"在 "+this.arrival+" 的 "+this.arrivalTime+" 第"+this.visit+"次到店。";
    }

}
