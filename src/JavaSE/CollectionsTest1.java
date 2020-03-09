package JavaSE;

import org.junit.Test;

import java.util.*;

public class CollectionsTest1 {

    @Test
    public void test01() {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(-1);
        arrayList1.add(3);
        arrayList1.add(3);
        arrayList1.add(-5);
        arrayList1.add(7);
        arrayList1.add(4);
        arrayList1.add(-9);
        arrayList1.add(-7);
        System.out.println("原始数组:");
        System.out.println(arrayList1);


        // void reverse(List list)：反转
        Collections.reverse(arrayList1);
        System.out.println("Collections.reverse(arrayList):");
        System.out.println(arrayList1);


        //旋转。当distance为正数时，将list后distance个元素整体移到前面。
        // 当distance为负数时，将 list的前distance个元素整体移到后面。
        Collections.rotate(arrayList1, 4);
        System.out.println("Collections.rotate(arrayList, 4):");
        System.out.println(arrayList1);

        // void sort(List list),按自然排序的升序排序
        Collections.sort(arrayList1);
        System.out.println("Collections.sort(arrayList):");
        System.out.println(arrayList1);

        // void shuffle(List list),随机排序
        Collections.shuffle(arrayList1);
        System.out.println("Collections.shuffle(arrayList):");
        System.out.println(arrayList1);

        // void swap(List list, int i , int j),交换两个索引位置的元素
        Collections.swap(arrayList1, 2, 5);
        System.out.println("Collections.swap(arrayList, 2, 5):");
        System.out.println(arrayList1);

        // 定制排序的用法
        Collections.sort(arrayList1, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("定制排序后：");
        System.out.println(arrayList1);
    }


    @Test
    public void test02() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.add(-3);
        arrayList2.add(-5);
        arrayList2.add(7);
        System.out.println("原始数组:");
        System.out.println(arrayList);

        //根据元素的自然顺序，返回最大的元素。 类比int min(Collection coll)
        System.out.println("Collections.max(arrayList):");
        System.out.println(Collections.max(arrayList));

        System.out.println("Collections.min(arrayList):");
        System.out.println(Collections.min(arrayList));

        //用新元素替换旧元素
        System.out.println("Collections.replaceAll(arrayList, 3, -3):");
        Collections.replaceAll(arrayList, 3, -3);
        System.out.println(arrayList);

        //统计元素出现次数
        System.out.println("Collections.frequency(arrayList, -3):");
        System.out.println(Collections.frequency(arrayList, -3));

        //统计target在list中第一次出现的索引，找不到则返回-1，类比int lastIndexOfSubList(List source, list target).
        System.out.println("Collections.indexOfSubList(arrayList, arrayList2):");
        System.out.println(Collections.indexOfSubList(arrayList, arrayList2));

        System.out.println("Collections.binarySearch(arrayList, 7):");
        // 对List进行二分查找，返回索引，List必须是有序的
        Collections.sort(arrayList);
        System.out.println(Collections.binarySearch(arrayList, 7));

    }


    @Test
    public void test03() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        HashSet<Integer> integers1 = new HashSet<>();
        integers1.add(1);
        integers1.add(3);
        integers1.add(2);
        Map scores = new HashMap();
        scores.put("语文", 80);
        scores.put("Java", 82);

        //Collections.emptyXXX();创建一个空的、不可改变的XXX对象
        List<Object> list = Collections.emptyList();
        System.out.println(list);//[]
        Set<Object> objects = Collections.emptySet();
        System.out.println(objects);//[]
        Map<Object, Object> objectObjectMap = Collections.emptyMap();
        System.out.println(objectObjectMap);//{}

        //Collections.singletonXXX();
        List<ArrayList<Integer>> arrayLists = Collections.singletonList(arrayList);
        System.out.println(arrayLists);//[[-1, 3, 3, -5, 7, 4, -9, -7]]
        //创建一个只有一个元素，且不可改变的Set对象
        Set<ArrayList<Integer>> singleton = Collections.singleton(arrayList);
        System.out.println(singleton);//[[-1, 3, 3, -5, 7, 4, -9, -7]]
        Map<String, String> nihao = Collections.singletonMap("1", "nihao");
        System.out.println(nihao);//{1=nihao}

        //unmodifiableXXX();创建普通XXX对象对应的不可变版本
        List<Integer> integers = Collections.unmodifiableList(arrayList);
        System.out.println(integers);//[-1, 3, 3, -5, 7, 4, -9, -7]
        Set<Integer> integers2 = Collections.unmodifiableSet(integers1);
        System.out.println(integers2);//[1, 2, 3]
        Map<Object, Object> objectObjectMap2 = Collections.unmodifiableMap(scores);
        System.out.println(objectObjectMap2);//{Java=82, 语文=80}

        //添加出现异常：java.lang.UnsupportedOperationException
//        list.add(1);
//        arrayLists.add(arrayList);
//        integers.add(1);
    }

    /**
     * 排序 : sort()
     */
    @Test
    public void test04() {
        // *************排序 sort****************
        int a[] = {1, 3, 2, 7, 6, 5, 4, 9};
        // sort(int[] a)方法按照数字顺序排列指定的数组。
        Arrays.sort(a);
        System.out.println("Arrays.sort(a):");
        for (int i : a) {
            System.out.print(i);
        }
        // 换行
        System.out.println();

        // sort(int[] a,int fromIndex,int toIndex)按升序排列数组的指定范围
        int b[] = {1, 3, 2, 7, 6, 5, 4, 9};
        Arrays.sort(b, 2, 6);
        System.out.println("Arrays.sort(b, 2, 6):");
        for (int i : b) {
            System.out.print(i);
        }
        // 换行
        System.out.println();

        int c[] = {1, 3, 2, 7, 6, 5, 4, 9};
        // parallelSort(int[] a) 按照数字顺序排列指定的数组(并行的)。同sort方法一样也有按范围的排序
        Arrays.parallelSort(c);
        System.out.println("Arrays.parallelSort(c)：");
        for (int i : c) {
            System.out.print(i);
        }
        // 换行
        System.out.println();

        // parallelSort给字符数组排序，sort也可以
        char d[] = {'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B'};
        Arrays.parallelSort(d);
        System.out.println("Arrays.parallelSort(d)：");
        for (char d2 : d) {
            System.out.print(d2);
        }
        // 换行
        System.out.println();
    }


    /*在做算法面试题的时候，我们还可能会经常遇到对字符串排序的情况,Arrays.sort() 对每个字符串的特定位置进行比较，然后按照升序排序。*/
    @Test
    public void test05() {
        String[] strs = {"abcdehg", "abcdefg", "abcdeag"};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));//[abcdeag, abcdefg, abcdehg]
    }

    /**
     * 查找 : binarySearch()
     */
    @Test
    public void test06() {
        // *************查找 binarySearch()****************
        char[] e = {'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B'};
        // 排序后再进行二分查找，否则找不到
        Arrays.sort(e);
        System.out.println("Arrays.sort(e)" + Arrays.toString(e));
        System.out.println("Arrays.binarySearch(e, 'c')：");
        int s = Arrays.binarySearch(e, 'c');
        System.out.println("字符c在数组的位置：" + s);
    }

    /**
     * 比较: equals()
     */
    @Test
    public void test07(){

    }
















}
