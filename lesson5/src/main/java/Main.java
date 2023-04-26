import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 123}, {300, 400, 500}};
        AppData appData = new AppData(header, data);

        try {
            appData.save("data.csv");
            appData.load("data.csv");

            System.out.println("Header:");
            for (String s : appData.header) {
                System.out.print(s + " ");
            }
            System.out.println();

            System.out.println("Data:");
            for (int[] row : appData.data) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
