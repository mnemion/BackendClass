package javatest;

public class work5 {
    public static void main(String[] args) {
        aa bb = new aa(7);
        Thread t = new Thread(bb);
        t.start();
    }

    static class aa implements Runnable {
        private int number;

        public aa(int number) {
            this.number = number;
        }

        @Override
        public void run() {
        	System.out.println("7단");
            for (int i = 1; i <= 9; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }
}