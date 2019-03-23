package pl.mpas.advanced_programming.files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Example {

    public static void main(String[] args) throws IOException {

        List<Alcohol> alcohols = Arrays.asList(
                new Alcohol("Golden", "Tequila", 40, 60.0, true),
                new Alcohol("Smirnoff", "Vodka", 40, 20.0, false),
                new Alcohol("Greek", "Wine", 14, 30.0, true),
                new Alcohol("Bocian", "Vodka", 38, 25.0, false),
                new Alcohol("Kozel", "Beer", 4, 6.0, true)
        );


        String myPath = File.separator + "C:/Users/Kamil/IdeaProjects/advancedprogramming"
                + File.separator + "alcohols.txt";
        try (AlcoholSerializer serializer
                     = new AlcoholSerializer(myPath)) {
            serializer.serializeAlcohols(alcohols);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String path = File.separator + "C:/Users/Kamil/IdeaProjects/advancedprogramming"
                + File.separator + "alcohols.txt";
        ;
        try (AlcoholDeserializer deserializer = new AlcoholDeserializer(path)) {
            System.out.println(deserializer.readAlko());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
