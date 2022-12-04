public class BlackCat extends Cat{
    static String kind = "BlackCat";
    private double storePrice;

    public BlackCat(String name,int age,String gender,String color,double storePrice) {
        super(name,age,gender,color,kind,storePrice);
        this.storePrice = storePrice;
    }

}
