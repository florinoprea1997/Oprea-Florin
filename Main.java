public class Main {

    public static void main(String[] args) {
        //Oprea Florin

        //Varianta 1
        MyFileReader variablila = new MyFileReader();
        variablila.SetPath("Pentalog.txt");
        variablila.PrintTextFromFile();


        //Varianta 2
        //MyFileReader citire= new MyFileReader("Pentalog.txt");
        //citire.PrintTextFromFile();

    }
}
