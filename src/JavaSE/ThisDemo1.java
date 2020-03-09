package JavaSE;

import org.junit.Test;

public class ThisDemo1 {
    private int number;

    public void changeNumber(int number) {

        System.out.println("局部变量的number值为：" + (number + 5));
        System.out.println("成员变量的number值为：" + (this.number + 2));
    }

    @Test
    public void test1() {

        int inputNum = 2;
        changeNumber(inputNum);
    }

    @Test
    public void test2() {

        int inputNum = 2;
        this.changeNumber(inputNum);
    }


    private String name;
    private int age;

    public ThisDemo1() {
        System.out.println("这是构造器1");
    }

    public ThisDemo1(String name) {

        this();
        this.name = name;
        System.out.println("这是构造器2");
    }

    public ThisDemo1(String name, int age) {

        this(name);
        this.age = age;
        System.out.println("这是构造器3");
    }

    public static void main(String[] args) {

        String userName = "jiangxs";
        int age = 24;
        ThisDemo1 t = new ThisDemo1(userName, age);
        System.out.println(t);
    }

    @Override
    public String toString() {
        return "JavaSE.ThisDemo1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
