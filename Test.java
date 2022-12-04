import java.time.LocalDate;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {

        Cat c1 = new OrangeCat("东",1,"母","白橘相间",500,true);
        Cat c2 = new BlackCat("多",2,"公","黑",405);
        Animal dog1 = new ChinesePastoralDog("噶米",1,"公","褐色",333);
//        Animal c3 = new Animal("米奇", 2, "母", "黑白相间", "英国鼠", 900,1500) ;
        Animal c3 = new Cat("顺", 2, "母", "灰蓝", "英国短耳猫", 1500);
        Customer p1 = new Customer("Bang Chan",6, LocalDate.now(), LocalTime.of(10,40),970,true,true);
        Customer p2 = new Customer("Chang Bin",9,LocalDate.of(2021,12,3), LocalTime.of(23,56),1000,false,false);
        Customer p3 = new Customer("Han",2,LocalDate.now(),LocalTime.of(14,10),50,false,true);
        Customer p4 = new Customer("Hyunjin",3,LocalDate.of(2021,12,6),LocalTime.of(19,15),1500,false,true);
        Customer p5 = new Customer("Lee Know",7,LocalDate.of(2021,12,7),LocalTime.now(),3000,true,false);

        MyAnimalShop SKZ = new MyAnimalShop();
        SKZ.setBalance(800);

        //买小动物
        try {
            SKZ.buy(c1);
            System.out.println("==========");
        } catch (InsufficientBalanceException ie ){
            ie.printStackTrace();
            System.out.println("店内余额不足，购买"+c1.getKind()+c1.getName()+"失败！");
            System.out.println("==============");
        }

        try {
            SKZ.buy(c2);
            System.out.println("==========");
        } catch (InsufficientBalanceException ie ){
            ie.printStackTrace();
            System.out.println("店内余额不足，购买"+c2.getKind()+c2.getName()+"失败！");
            System.out.println("==============");
        }finally {

        }

        try {
            SKZ.buy(c3);
            System.out.println("==========");
        } catch (InsufficientBalanceException ie ){
            ie.printStackTrace();
            System.out.println("店内余额不足，购买"+c3.getKind()+c3.getName()+"失败！");
            System.out.println("==============");
        }finally {
        }

        try {
            SKZ.buy(dog1);
            System.out.println("==========");
        } catch (InsufficientBalanceException ie ){
            ie.printStackTrace();
            System.out.println("店内余额不足，购买"+dog1.getKind()+dog1.getName()+"失败！");
            System.out.println("==============");
        }finally {
        }

        Animal animal1 = SKZ.AnimalList.get(SKZ.random.nextInt(SKZ.AnimalList.size()));
        Animal animal2 = SKZ.AnimalList.get(SKZ.random.nextInt(SKZ.AnimalList.size()));
        Animal animal3 = SKZ.AnimalList.get(SKZ.random.nextInt(SKZ.AnimalList.size()));
        Animal animal4 = SKZ.AnimalList.get(SKZ.random.nextInt(SKZ.AnimalList.size()));
        Animal animal5 = SKZ.AnimalList.get(SKZ.random.nextInt(SKZ.AnimalList.size()));


        try {
            SKZ.serve(p1,animal1);
            System.out.println("==============");
        }catch (AnimalNotFoundException cne){
            cne.printStackTrace();
            System.out.println("店内无小动物，请稍后。");
            System.out.println("==============");
        }finally {

        }

        try {
            SKZ.serve(p2,animal2);
            System.out.println("==============");
        }catch (AnimalNotFoundException cne){
            cne.printStackTrace();
            System.out.println("店内无小动物，请稍后。");
            System.out.println("==============");
        }finally {

        }

        try {
            SKZ.serve(p3,animal3);
            System.out.println("==============");
        }catch (AnimalNotFoundException cne){
            cne.printStackTrace();
            System.out.println("店内无小动物，请稍后。");
            System.out.println("==============");
        }finally {

        }

        try {
            SKZ.serve(p4,animal4);
            System.out.println("==============");
        }catch (AnimalNotFoundException cne){
            cne.printStackTrace();
            System.out.println("店内无小动物，请稍后。");
            System.out.println("==============");
        }finally {

        }

        try {
            SKZ.serve(p5,animal5);
            System.out.println("==============");
        }catch (AnimalNotFoundException cne){
            cne.printStackTrace();
            System.out.println("店内无小动物，请稍后。");
            System.out.println("==============");
        }finally {

        }

        SKZ.close();
    }
}
