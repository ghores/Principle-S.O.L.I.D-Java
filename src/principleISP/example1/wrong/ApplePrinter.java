package principleISP.example1.wrong;

public class ApplePrinter implements Printer {
    @Override
    public void printBlackAndWhite() {
        throw new RuntimeException("Not Supported");
    }

    @Override
    public void scan() {
        System.out.println("Scanning");
    }

    @Override
    public void printDuplex() {
        throw new RuntimeException("Not Supported");
    }

    @Override
    public void colorPrint() {
        System.out.println("Printing Colorful");
    }
}
