public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        User user = new User("noName", 26);
        User greenUser = new User("Green", 36);
        User blueUser = new User("Blue", 18);
        User goldUser = new User("Gold", 50);
        User redUser = new User("Red", 41);
        User violetUser = new User("Violet", 32);
        User orangeUser = new User("Orange", 19);

        User[] users = new User[] {user, greenUser, blueUser, goldUser, redUser, violetUser, orangeUser};
        int sum = 0;
        for (int age = 0; age < users.length; age++) {
            sum = sum + users[age].age;
        }
        for (int age = 0; age < users.length; age++) {
            if( users[age].age < sum/users.length) {
                System.out.println(users[age].name);
            }
        }
    }
}
