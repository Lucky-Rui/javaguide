package JavaSE;

public class PointerTest {


    public static void main(String[] args) {
        String name = "Scott";
        int age = 5;
        User user = new User();
        user.setName(name);
        user.setAge(age);
        System.out.println("before change user = " + user);

        change(user, name, age);
        System.out.println("1111----"+System.identityHashCode(user));
        System.out.println("name = " + user.name);
        System.out.println("age = " + user.age);
        System.out.println("after change user = " + user);
    }

    public static void change(User user, String name, int age) {
        User user1 = new User();
        name = "Tom";
        age = 20;
        user1.setName(name);
        user1.setAge(age);
        user = user1;
        System.out.println("aaaaa = " + user);
        System.out.println("bbbbb = " + user1);

        // name = "Tom";
        // age = 20;
        // user.setName(name);
        // user.setAge(age);
        System.out.println("2222---"+System.identityHashCode(user));
        System.out.println("3333---"+System.identityHashCode(user1));

    }

    static class User {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "{name : " + name + ", age : " + age + "}";
        }
    }

}
