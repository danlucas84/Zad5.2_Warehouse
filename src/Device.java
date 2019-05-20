public class Device {
    //code, producer, type, price
    private String code;
    private String producer;
    private String type;
    private double price;

    Device(String code, String producer, String type, double price) {
        this(code,producer,type);
        this.price = price;
    }

    Device(String code, String producer, String type) {
            this.code = code;
            this.producer = producer;
            this.type = type;
        }

        void getInfo() {
            System.out.println(code + " " + producer + " " + type + " " + price);
    }
}
}
