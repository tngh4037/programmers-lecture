package etc.practice;

import java.util.List;

public class IpDuplicateCheckServiceMain {

    private static List<String> IP_LIST = List.of("127.0.0.1", "127.0.0.2", "127.0.0.3", "127.0.0.4", "127.0.0.5");

    public static void main(String[] args) {
        IpDuplicateCheckService ipDuplicateCheckService = new IpDuplicateCheckService();

        Thread t1 = new Thread(new RunTask(ipDuplicateCheckService));
        Thread t2 = new Thread(new RunTask(ipDuplicateCheckService));
        Thread t3 = new Thread(new RunTask(ipDuplicateCheckService));
        Thread t4 = new Thread(new RunTask(ipDuplicateCheckService));
        Thread t5 = new Thread(new RunTask(ipDuplicateCheckService));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    static class RunTask implements Runnable {

        private IpDuplicateCheckService ipDuplicateCheck;

        public RunTask(IpDuplicateCheckService ipDuplicateCheck) {
            this.ipDuplicateCheck = ipDuplicateCheck;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(10);

                for (int i = 0; i < IP_LIST.size(); i++) {
                    boolean result = ipDuplicateCheck.saveIp(IP_LIST.get(i));
                    System.out.println("[" + Thread.currentThread().getName() + "]" + " result: " + result + ", ip: " + IP_LIST.get(i));
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
