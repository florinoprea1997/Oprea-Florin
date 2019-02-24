import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    private String pentalog;

    //constructor gol
    public MyFileReader() {
    }

    //constructor in care salvam locatia fisierului
    public MyFileReader(String path) {
        pentalog = path;
    }

    //Setarea unui path
    public void SetPath(String path) {
        pentalog = path;
    }

    //Functia care citeste din fisier si afiseaza continutul.
    public void PrintTextFromFile() {
        try {
            FileReader fileReader = new FileReader(pentalog);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit.");
        } catch (IOException e) {
            System.out.println("Eroare la citire din fisier.");
        } catch (NullPointerException e) {
            System.out.println("Calea fisierului nu a fost setata");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
