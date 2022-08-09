package AnchorLengthEst;

public class SideEstimation {
    public static double SectionArea (double Diameter) {
        return Math.PI * ((Diameter/2) * (Diameter/2)); //A=pi*r^2
    }
    public static double Perimeter (double Diameter) {
        return 2 * Math.PI * (Diameter/2); //P=2*pi*R
    }
}
