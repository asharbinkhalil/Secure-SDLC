package CommandClient;

public class CommandPatternClient {
    public static void main(String[] args) {
        Restaurant KFC = new Restaurant();

        DeliveryDriver OrderSelect = new OrderSelected(KFC);
        DeliveryDriver OrderDetails = new OrderDetails(KFC);
        DeliveryDriver OrderAddress = new OrderAddress(KFC);
        DeliveryDriver OrderConfirm = new OrderConfirmed(KFC);

        OrderReceiver Lobby = new OrderReceiver(OrderSelect,OrderDetails,OrderAddress, OrderConfirm);

        Lobby.Order("Burger");
        Lobby.Details("No Mayo");
        Lobby.Address("Mian Channu");
        Lobby.Confirm("Yes");
    }
}

class Restaurant {
    public void Selected(String Order) {
        System.out.printf("Order Selected: %s\n", Order);
    }

    public void Details(String Order) {
        System.out.printf("Order Details: %s\n", Order);
    }

    public void Address(String Order) {
        System.out.printf("Order Address: %s\n", Order);
    }

    public void Confirm(String Order) {
        System.out.printf("Order Confirmed: %s\n", Order);
    }
}

class OrderSelected implements DeliveryDriver {
    private Restaurant KFC;

    public OrderSelected(Restaurant KFC) {
        this.KFC = KFC;
    }

    public void execute(String Order) {
        KFC.Selected(Order);
    }
}

class OrderDetails implements DeliveryDriver {
    private Restaurant KFC;

    public OrderDetails(Restaurant KFC) {
        this.KFC = KFC;
    }

    public void execute(String Order) {
        KFC.Details(Order);
    }
}

class OrderAddress implements DeliveryDriver {
    private Restaurant KFC;

    public OrderAddress(Restaurant KFC) {
        this.KFC = KFC;
    }

    public void execute(String Order) {
        KFC.Address(Order);
    }
}

class OrderConfirmed implements DeliveryDriver {
    private Restaurant KFC;

    public OrderConfirmed(Restaurant KFC) {
        this.KFC = KFC;
    }

    public void execute(String Order) {
        KFC.Confirm(Order);
    }
}

class OrderReceiver {
    private DeliveryDriver SelectedCommand;
    private DeliveryDriver DetailsCommand;
    private DeliveryDriver AddressCommand;
    private DeliveryDriver ConfirmCommand;

    public OrderReceiver(DeliveryDriver Selected,DeliveryDriver Details,DeliveryDriver Address, DeliveryDriver Confirm) {
        this.SelectedCommand = Selected;
        this.DetailsCommand = Details;
        this.AddressCommand = Address;
        this.ConfirmCommand = Confirm;
    }

    public void Order(String Order) {
        SelectedCommand.execute(Order);
    }

    public void Details(String Order) {
        DetailsCommand.execute(Order);
    }

    public void Address(String Order) {
        AddressCommand.execute(Order);
    }

    public void Confirm(String Order) {
        ConfirmCommand.execute(Order);
    }
}

interface DeliveryDriver {
    void execute(String Order);
}
