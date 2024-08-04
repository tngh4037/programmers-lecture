package z_challenges.practice;

import java.io.*;
import java.time.LocalDate;

public class IpDuplicateCheckService {

    private final int LIMIT_COUNT = 3;

    public synchronized boolean checkIp(String ipAddress) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(createFile()));

            String line = null;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(" ");
                String ip = split[0];
                int count = Integer.parseInt(split[1]);
                if (ip.equals(ipAddress) && count >= LIMIT_COUNT) {
                    return false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return true;
    }

    public synchronized boolean saveIp(String ipAddress) {
        String fileName = createFile();
        BufferedReader br = null;
        FileWriter bw = null;

        StringBuilder sb = new StringBuilder();

        try {
            br = new BufferedReader(new FileReader(fileName));

            String line = null;
            boolean isExist = false;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(" ");
                String ip = split[0];
                int count = Integer.parseInt(split[1]);

                if (ip.equals(ipAddress)) {
                    if (count >= LIMIT_COUNT) {
                        return false;
                    }

                    isExist = true;
                    count++;
                }

                sb.append(ip).append(" ").append(count).append("\n");
            }

            if (!isExist) {
                sb.append(ipAddress).append(" ").append(1).append("\n");
            }

            sb.deleteCharAt(sb.length() - 1);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
           try {
               br.close();
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
        }

        try {
            bw = new FileWriter(fileName);
            bw.write(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
             try {
                 bw.close();
             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
        }

        return true;
    }

    private String createFile() {
        String fileName = LocalDate.now() + ".txt";
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println(fileName + " created");
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return fileName;
    }
}
