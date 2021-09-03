package ru.netology;

public class ATSThread implements Runnable {

    ATS ATS;
    private int repeatTime = 200;
    private int repeatCount = 10;

    public ATSThread(ATS ATS) {
        this.ATS = ATS;
    }

    public void run() {
        System.out.println("АТС запустилась");
        try {
            for (int i = 1; i <= repeatCount; i++) {
                String str = "Звонок" + i;
                ATS.addCall(str);
                System.out.println("АТС добавила : " + str);
                Thread.sleep(repeatTime);
            }
            ATS.cycle = false;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
