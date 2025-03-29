package principleISP.example1.wrong;

public class HPPrinter implements Printer {
    @Override
    public void printBlackAndWhite() {
        System.out.println("Printing Black & White");
    }

    @Override
    public void scan() {
        System.out.println("Scan");
    }

    @Override
    public void printDuplex() {
        System.out.println("Printing Black & White (Front)");
        System.out.println("Printing Black & White (Back)");
    }

    @Override
    public void colorPrint() {
        System.out.println("Printing Colorful");
    }
}
