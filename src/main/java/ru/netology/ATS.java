package ru.netology;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ATS {

    Queue<String> queue = new ConcurrentLinkedQueue<>();
    volatile boolean cycle = true;

    void addCall(String str){
        queue.add(str);
    }

    String getCall(){
        return queue.poll();
    }

    int getSize(){
        return queue.size();
    }
}
