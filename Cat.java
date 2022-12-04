public class Cat extends Animal{
    private static double price = 200;
    private double storePrice;


    public Cat(String name,int age,String gender,String color,String kind,double storePrice){
        super(name,age,gender,color,kind,price,storePrice);
        this.storePrice = storePrice;
    }
}
