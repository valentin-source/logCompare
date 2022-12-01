import java.io.*;

public class Main {
    public static void main(String[] args) {
        String file1 = "rpmpackagelogV.txt";
        String file2 = "rpmpackagelogB.txt";

        //for each line in file1, check if it is in file2
        try {
            BufferedReader br = new BufferedReader(new FileReader(file1));
            String line;
            while ((line = br.readLine()) != null) {
                //process the line
                System.out.println(line);
                if (!lineInFile(line, file2)) {
                    System.out.println("Not Found");
                    System.out.println(line);
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    //this function checks if a line is in a .txt file
    public static boolean lineInFile(String line, String file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line2;
            while ((line2 = br.readLine()) != null) {
                if (line2.equals(line)) {
                    br.close();
                    return true;
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}