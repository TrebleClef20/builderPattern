public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder()
                .lastName("Calma")
                .firstName("Treb")
                .age(21)
                .build();

        System.out.println(user1);
    }
}
