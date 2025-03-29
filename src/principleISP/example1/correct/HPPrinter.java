package principleISP.example1.correct;

import principleISP.example1.correct.interfaces.*;

public class HPPrinter implements
        BWPrinter, Scanner, DuplexPrinter, ColorfulPrinter {
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
