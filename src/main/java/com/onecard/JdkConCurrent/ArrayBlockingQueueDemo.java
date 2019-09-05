package com.onecard.JdkConCurrent;

import com.alibaba.fastjson.JSON;
import lombok.Cleanup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;


public class ArrayBlockingQueueDemo {

    private final static int SIZE = 3;

    public static void main(String[] args) throws Exception{

        jdkMethod();

    }

    private static void jdkMethod() throws Exception{
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(SIZE, false, list);
        queue.add("1");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            String b = iterator.next();
            System.out.println("iterator = " + b);
        }
        //queue.clear();
//        List<String> ds = new ArrayList<String>();
//        queue.drainTo(ds,1);
//        System.out.println("iterator = " + JSON.toJSONString(queue));
//        System.out.println("ds = " + JSON.toJSONString(ds));
//        List<String> dss = new ArrayList<String>();
//        queue.drainTo(dss);
//        System.out.println("iterator = " + JSON.toJSONString(queue));
//        System.out.println("dss = " + JSON.toJSONString(dss));
//        System.out.println(queue.offer("d"));
//        System.out.println(queue.offer("d",1, TimeUnit.SECONDS));
//        System.out.println("queue = offer " + JSON.toJSONString(queue));
//        System.out.println("peek = " + queue.peek());
//        System.out.println("queue =peek " + JSON.toJSONString(queue));
//        System.out.println("poll = " + queue.poll());
//        System.out.println("queue =poll " + JSON.toJSONString(queue));
        //queue.put("e");
        //System.out.println("queue =put = " + JSON.toJSONString(queue));
//        System.out.println("queue =remainingCapacity = " + queue.remainingCapacity());
//        System.out.println("removec = " + queue.remove("c"));
//        System.out.println("queue =remove = " + JSON.toJSONString(queue));
//        System.out.println("removeb = " + queue.remove("b"));
//        System.out.println("queue =remove = " + JSON.toJSONString(queue));
//        queue.clear();
//        queue.take();
        String[] a = new String[10];
        System.out.println("spliterator = " + queue.toArray(a));
        System.out.println("spliterator = " + JSON.toJSONString(a));
    }

}
