package app;

public class Main {

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String fileName = "myfile";
        String fileContent = "My very important information.";
        String result = handler.writeFile(fileName, fileContent);
        String content = handler.readFile(fileName);
        getOutput("RESULT: " + result);
        getOutput("FILE CONTENT: " + content);
    }

    private static void getOutput(String output){
        System.out.println(output);
    }
}
