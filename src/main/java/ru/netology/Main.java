package ru.netology;

public class Main {

    public static void main(String[] args) {

        ATS ats = new ATS();

        Thread atsTh = new Thread(new ATSThread(ats), "Поток-АТС");
        Thread operatorTh = new Thread(new OperatorThread(ats), "Поток-Оператор");

        atsTh.start();
        operatorTh.start();

    }
}
