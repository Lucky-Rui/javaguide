import org.junit.Test;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


    @Test
    public void Text1() {
        String a = new String("ab"); // a 为一个引用
        String b = new String("ab"); // b为另一个引用,对象的内容一样
        String aa = "ab"; // 放在常量池中
        String bb = "ab"; // 从常量池中查找
        if (aa == bb) {// true
            System.out.println("aa==bb");
        }
        if (a == b) {// false，非同一对象
            System.out.println("a==b");
        }
        if (a.equals(b)) { // true
            System.out.println("aEQb");
        }
        if (42 == 42.0) { // true
            System.out.println("true");
        }
    }

    @Test
    public void Text2() {
        int num1 = 10;
        int num2 = 20;

        swap2(num1, num2);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }

    //方法不能修改一个基本数据类型的参数
    public static void swap2(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    @Test
    public void Text3() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] array) {
        // 将数组的第一个元素变为0
        array[0] = 0;
    }


    @Test
    public void Text4() {
        Student s1 = new Student("小张");
        Student s2 = new Student("小李");
        swap4(s1, s2);
        System.out.println("s1:" + s1.getName());
        System.out.println("s2:" + s2.getName());
    }

    public static void swap4(Student x, Student y) {
        Student temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x.getName());
        System.out.println("y:" + y.getName());
    }

    static class Student {
        public String name;

        public Student() {
        }

        public Student(String name) {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class Manager {
        Employees[] employees;

        void manageEmployees() {
            int totalEmp = this.employees.length;
            System.out.println("Total employees: " + totalEmp);
            this.report();
        }

        void report() {
        }
    }

    class Employees {

    }


}
