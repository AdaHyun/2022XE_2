public abstract class Animal {
    private String name;
    private int age;
    private String gender;
    private String color;
    private String kind;
    private double price;
    private double storePrice;

    public Animal(){

    }
    public Animal (String name,int age,String gender,String color,String kind,double price,double storePrice){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
        this.kind  = kind;
        this.price = price;
        this.storePrice = storePrice;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getKind() {
        return kind;
    }

    public double getPrice() {
        return price;
    }

    public double getStorePrice() {
        return storePrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStorePrice(double storePrice) {
        this.storePrice = storePrice;
    }

    @Override
    public String toString() {
        return "品种["+this.kind+"] 姓名["
                +this.name+"] 年龄["+this.age+"岁] 性别["+
                this.gender+"] 颜色["+this.color+"] 售价["+this.storePrice+"]";
    }
}
