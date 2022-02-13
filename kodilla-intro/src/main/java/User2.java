public class User2 {
    public static void main(String[] args) {

        User emilia = new User("Emilia", 20);
        User klaudia = new User("Klaudia", 33);
        User kinga = new User("Kinga", 58);
        User agnieszka = new User("Agnieszka", 13);
        User sebastian = new User("Sebastian", 18);
        User filip = new User("Filip", 45);

        User[] users = {emilia, klaudia, kinga, agnieszka, sebastian, filip};

        int usersLength = users.length;
        double sum = 0;

        for (int i = 0; i < usersLength; i++) {
            sum = sum + users[i].getAge();
        }
        double average = sum / usersLength;

        System.out.println(average);

        for (int i = 0; i < usersLength; i++) {
            if (users[i].getAge() < average) {
                System.out.println(users[i].getName());
            }
        }

//        public void checkPrice() {
//            if (userAge < average) {
//                System.out.println(name);
//            } else {
//                System.out.println("maybe I should delete this line completely");
//            }
//        }
    }
}