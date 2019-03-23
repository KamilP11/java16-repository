package pl.mpas.advanced_programming.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AlcoholDeserializer implements Closeable {

    private BufferedReader fileReader;
    private String filePath;

    public AlcoholDeserializer(String filePath) throws FileNotFoundException {
        this.filePath = Objects.requireNonNull(filePath,
                "Path cannot be null!!!");

        fileReader = new BufferedReader(new FileReader(filePath));
    }

    public List<Alcohol> readAlko() throws IOException {
        return readAlcoholsJava7();
    }

    public List<Alcohol> readAlcoholsJava8(){
        List<Alcohol> result = new ArrayList<>();

        final int brandIndex = 0;
        final int typeIndex = 1;
        final int voltageIndex = 2;
        final int priceIndex = 3;
        final int tastyIndex = 4;

        fileReader.lines()
                .filter(line -> line.length()>0)
                .map(s -> s.split(" +"))
                .map(o -> {
                    String voltageWithProc = o[voltageIndex];
                    String patternToCut = "%";
                    int voltage = Integer.parseInt(
                            voltageWithProc.substring(0, voltageWithProc.length() - patternToCut.length()));

                    return new Alcohol(o[brandIndex],
                            o[typeIndex],
                            voltage,
                            Double.parseDouble(o[priceIndex]),
                            Boolean.parseBoolean(o[tastyIndex]));
                })
                .collect(Collectors.toList());

        return result;
    }

    private List<Alcohol> readAlcoholsJava7() throws IOException {
        List<Alcohol> result = new ArrayList<>();
        String line = null;
        while ((line = fileReader.readLine()) != null) {
            Scanner scanner = new Scanner(line);
            String brand = scanner.next();
            String type = scanner.next();
            // 5%
            String voltageWithProc = scanner.next();
            String patternToCut = "%";
            int voltage = Integer.parseInt(
            voltageWithProc.substring(0, voltageWithProc.length() - patternToCut.length()));
            double price = scanner.nextDouble();
            boolean isTasty = scanner.nextBoolean();

            result.add(new Alcohol(brand,type,voltage,price,isTasty));

        }
        return result;
    }

    @Override
    public void close() throws IOException {
        fileReader.close();
    }
}
