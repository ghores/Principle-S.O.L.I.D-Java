package principleISP.example1.correct;

import principleISP.example1.correct.interfaces.ColorfulPrinter;
import principleISP.example1.correct.interfaces.Scanner;

public class ApplePrinter implements
        Scanner, ColorfulPrinter {
    @Override
    public void scan() {
        System.out.println("Scanning");
    }

    @Override
    public void colorPrint() {
        System.out.println("Printing Colorful");
    }
}
