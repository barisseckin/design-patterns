package factory;

public class Main {
    public static void main(String[] args) {
        String file = FileExporterFactory.getInstance(FileType.PDF).export(" test content");
        System.out.println(file);

    }
}
