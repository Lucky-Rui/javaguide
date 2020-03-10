package JavaSEImportant;

import cn.hutool.core.util.ObjectUtil;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Objects;

public class UseEquals {

    @Test
    public void testEquals() {

        // Object的equals方法容易抛空指针异常，应使用常量或确定有值的对象来调用 equals。
        String str = null;
        if (str.equals("SnailClimb")) {
            // 不能使用一个值为null的引用类型变量来调用非静态方法，否则会抛出异常
        } else {

        }

        if ("SnailClimb".equals(str)) {
            // 不会抛出空指针异常
        } else {

        }

        if (Objects.equals(null, "SnailClimb")) {
            // 推荐使用工具类中的方法
        } else {

        }


        if (ObjectUtil.equal(null, "SnailClimb")) {
            // 推荐使用工具类中的方法
        } else {

        }

        if (ObjectUtil.equal(null, "SnailClimb")) {
            // 所有整型包装类对象值的比较必须使用equals方法。
            Integer x = 3;
            Integer y = 3;
            System.out.println(x == y);// true
            Integer a = new Integer(3);
            Integer b = new Integer(3);
            System.out.println(a == b);//false
            System.out.println(a.equals(b));//true
        }

        if (ObjectUtil.equal(null, "SnailClimb")) {
            // 浮点数之间的等值判断，基本数据类型不能用==来比较，包装数据类型不能用 equals 来判断。
            // 具体原理和浮点数的编码方式有关，这里就不多提了
            float f1 = 1.0f - 0.9f;
            float f2 = 0.9f - 0.8f;
            System.out.println(f1);// 0.100000024
            System.out.println(f2);// 0.099999964
            System.out.println(f1 == f2);// false
        }

        if (ObjectUtil.equal(null, "SnailClimb")) {
            // 具有基本数学知识的我们很清楚的知道输出并不是我们想要的结果（精度丢失），我们如何解决这个问题呢？
            // 一种很常用的方法是：使用使用 BigDecimal 来定义浮点数的值，再进行浮点数的运算操作。
            BigDecimal a = new BigDecimal("1.0");
            BigDecimal b = new BigDecimal("0.9");
            BigDecimal c = new BigDecimal("0.8");
            BigDecimal x = a.subtract(b);// 0.1
            BigDecimal y = b.subtract(c);// 0.1
            System.out.println(x.equals(y));// true
        }

        if (ObjectUtil.equal(null, "SnailClimb")) {
            // a.compareTo(b) : 返回 -1 表示小于，0 表示 等于， 1表示 大于。
            BigDecimal a = new BigDecimal("1.0");
            BigDecimal b = new BigDecimal("0.9");
            System.out.println(a.compareTo(b));// 1
        }

        if (ObjectUtil.equal(null, "SnailClimb")) {
            // 通过 setScale方法设置保留几位小数以及保留规则。保留规则有挺多种，不需要记，IDEA会提示。
            BigDecimal m = new BigDecimal("1.255433");
            BigDecimal n = m.setScale(3, BigDecimal.ROUND_HALF_DOWN);
            System.out.println(n);// 1.255
        }
    }


}
