import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppData {
    public String[] header;
    public int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Сохраняем заголовок
            for (int i = 0; i < header.length; i++) {
                writer.write(header[i]);
                if (i < header.length - 1) {
                    writer.write(";");
                }
            }
            writer.newLine();

            // Сохраняем данные
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    writer.write(Integer.toString(data[i][j]));
                    if (j < data[i].length - 1) {
                        writer.write(";");
                    }
                }
                writer.newLine();
            }
        }
    }

    public void load(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line != null) {
                header = line.split(";");
            }

            int rows = 0;
            while ((line = reader.readLine()) != null) {
                rows++;
            }

            data = new int[rows][header.length];
            reader.close();

            //reader = new BufferedReader(new FileReader(fileName));
            reader.readLine(); // Пропускаем строку заголовка

            int row = 0;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                for (int i = 0; i < values.length; i++) {
                    data[row][i] = Integer.parseInt(values[i]);
                }
                row++;
            }
        }
    }
}