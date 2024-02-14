package app;

public class Main {

    public static void main(String[] args) {
        Outputer outputer = new Outputer();
        DataProvider provider = new DataProvider();
        outputer.getOutput(provider.getData(), 3);
        outputer.getOutputList(provider.getData());
    }
}
