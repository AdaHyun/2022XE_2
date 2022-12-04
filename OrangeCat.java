public class OrangeCat extends Cat{

    static String kind = "OrangeCat";
    private boolean isFat;

    //此处不是继承父类的构造 而是调用 *子类不能继承父类的构造方法，但是必须调用
    // *当父类是无参函数时，子类调用默认构造
    // *当父类是有参函数时，子类不调用默认构造，此时子类必须自主调用父类的构造方法*
    public OrangeCat(String name, int age,String gender,String color,double storePrice,boolean isFat) {
        super(name,age,gender,color,kind,storePrice);
        this.isFat = isFat;
    }

    @Override
    public String getKind() {
        return kind;
    }

    public boolean isFat() {
        return isFat;
    }

    public void setFat(boolean fat) {
        isFat = fat;
    }
}
