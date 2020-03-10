package JavaSEImportant;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class UseArray {

    @Test
    public void testArrays() {

        Boolean flag = false;

        if (flag) {
            // Arrays.asList()在平时开发中还是比较常见的，我们可以使用它将一个数组转换为一个List集合。
            String[] myArray = {"Apple", "Banana", "Orange"};
            List<String> myList0 = Arrays.asList(myArray);
            //上面两个语句等价于下面一条语句
            List<String> myList = Arrays.asList("Apple", "Banana", "Orange");
            for (String list :
                    myList) {
                System.out.println(list);
            }
        }


        if (flag) {
            // 使用集合的修改方法:add()、remove()、clear()会抛出异常。
            List myList = Arrays.asList(1, 2, 3);
            myList.add(4);//运行时报错：UnsupportedOperationException
            myList.remove(1);//运行时报错：UnsupportedOperationException
            myList.clear();//运行时报错：UnsupportedOperationException
        }

        if (flag) {
            int[] myArray = {1, 2, 3};
            List myList = Arrays.asList(myArray);
            System.out.println(myList.size());//1
            System.out.println(myList.get(0));//数组地址值
            System.out.println(myList.get(1));//报错：ArrayIndexOutOfBoundsException
            int[] array = (int[]) myList.get(0);
            System.out.println(array[0]);//1

            for (Object list :
                    myList) {
                System.out.println(list);//数组地址值
            }
        }


        if (flag) {//如何正确的将数组转换为arraylist
            // 最简便的方法(推荐)
            List list = new ArrayList<>(Arrays.asList("a", "b", "c"));

            // 使用 Java8 的Stream(推荐)
            Integer[] myArray = {1, 2, 3};
            List myList = Arrays.stream(myArray).collect(Collectors.toList());
            //基本类型也可以实现转换（依赖boxed的装箱操作）
            int[] myArray2 = {1, 2, 3};
            List myList2 = Arrays.stream(myArray2).boxed().collect(Collectors.toList());

        }

        if (!flag) {
            // 不要在 foreach 循环里进行元素的 remove/add 操作
            List<String> list = new ArrayList<>();
            list.add("1");
            list.add("2");
            Iterator<String> iterator = list.iterator();

            // 正例
            while (iterator.hasNext()) {
                String item = iterator.next();
                if ("2".equals(item)) {
                    iterator.remove();
                }
            }

            // 因为如果列表在任何时间从结构上修改创建迭代器之后，
            // 以任何方式除非通过迭代器自身remove/add方法，
            // 迭代器都将抛出一个ConcurrentModificationException,
            // 这就是单线程状态下产生的 fail-fast 机制。
            // for (String item : list) {
            //     if ("2".equals(item)) {
            //         list.remove(item);
            //     }
            // }
            System.out.println(list);
        }


    }
}
