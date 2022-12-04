public interface AnimalShop {
    void buy(Animal a) throws InsufficientBalanceException;
    void serve(Customer p,Animal a);
    void close();

}
