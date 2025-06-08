public class Test {
    public static void main(String[] args) {
        try {
            Student s = new Student("Arpan",-1);
        } catch (InvalidSemException e) {
            System.out.println("Invalid Sem Exception");
        }
    }
}
