public class ChinesePastoralDog extends Animal{
    private static boolean isVaccineInjected;
    private static double price = 200;
    private static double storePrice;
    private static String kind = "chinese pastoral dog";

    public ChinesePastoralDog(String name,int age,String gender,String color,double storePrice){
        super(name,age,gender,color,kind,price,storePrice);
        this.storePrice = storePrice;
    }

    public static boolean isIsVaccineInjected() {
        return isVaccineInjected;
    }

}
