package ru.netology;

public class OperatorThread implements Runnable {

    ATS ATS;
    private int repeatTime = 500;

    public OperatorThread(ATS ATS) {
        this.ATS = ATS;
    }

    public void run() {
        String str;
        System.out.println("  Оператор начал работу");

        while (ATS.cycle || ATS.getSize() > 0) {
            if ( (str = ATS.getCall() ) != null )
                System.out.println("  Оператор обработал : " + str);
            try {
                Thread.sleep(repeatTime);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
