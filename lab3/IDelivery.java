package lab3;

public interface IDelivery {
    void deliverOrder(Order1 order);
}

class CourierDelivery implements IDelivery {
    @Override
    public void deliverOrder(Order1 order) {
        System.out.println("Доставка курьером инициирована.");
    }
}