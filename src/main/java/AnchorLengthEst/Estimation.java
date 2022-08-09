package AnchorLengthEst;

public class Estimation {
    public static void main(String[] args) {
        Data4Est data4Est = new Data4Est();

        data4Est.ReinFrsDiameterEst=Query4User.SetValReinFrsDiameterEst();
        data4Est.ReinFrsDiameterFact=Query4User.SetValReinFrsDiameterFact();
        data4Est.ReinFrsSectionAreaEst=SideEstimation.SectionArea(data4Est.ReinFrsDiameterEst);
        data4Est.ReinFrsSectionAreaFact=SideEstimation.SectionArea(data4Est.ReinFrsDiameterFact);
        data4Est.ReinFrsPerimeterSectionEst=SideEstimation.Perimeter(data4Est.ReinFrsDiameterEst);
        data4Est.ReinFrsClass=Query4User.SetValReinFrsClass();
        System.out.println("Rs = "+data4Est.ReinFrsClass+" MPa");
        data4Est.ConcreteClass=Query4User.SetValConcreteClass();
        System.out.println("Rbond = "+data4Est.ConcreteClass+" MPa");
        data4Est.WorkTypeKf=Query4User.SetValWorkTypeKf();
        System.out.println("Kf = "+data4Est.WorkTypeKf);
    }
}
