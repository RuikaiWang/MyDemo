package com.wrk.algorithms.sort;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        int[] ints = new Random().ints(20,0,999).toArray();
        //选择排序
//        showTimeSort(new SelectionSort()).sort(ints);
        //冒泡排序
//        showTimeSort(new BubbleSort()).sort(ints);
        //插入排序
//        showTimeSort(new InsertionSort()).sort(ints);


    }
    //动态代理打印数组和时间（纳秒）
    public static Sort showTimeSort(Sort sort){
        return (Sort)Proxy.newProxyInstance(Sort.class.getClassLoader(), new Class[]{Sort.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(Arrays.toString((int[])args[0]));
                long start = System.nanoTime();
                Object invoke = method.invoke(sort, args);
                System.out.println(sort.getClass().getSimpleName()+":"+(System.nanoTime()-start)+"   "+Arrays.toString((int[])args[0]));
                return invoke;
            }
        });
    }
}
