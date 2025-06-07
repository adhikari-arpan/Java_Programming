public class Child extends Student {
    private String address;
    private long phone;

    public Child(String name, int age, float grade,String address, long phone) {
        super(name,age,grade);
        this.address = address;
        this.phone = phone;
    }

    public String getData() {
        return super.toString() + " " + address + " " + phone;
    }


}
