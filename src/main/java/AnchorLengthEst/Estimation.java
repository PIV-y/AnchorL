package AnchorLengthEst;

public class Estimation {
    public static void main(String[] args) {
        Data4Est data4Est = new Data4Est();

        data4Est.setReinFrsDiameterEst(Query4User.SetValReinFrsDiameterEst());
        data4Est.setReinFrsDiameterFact(Query4User.SetValReinFrsDiameterFact());
        data4Est.setReinFrsSectionAreaEst(SideEstimation.SectionArea(data4Est.getReinFrsDiameterEst()));
        data4Est.setReinFrsSectionAreaFact(SideEstimation.SectionArea(data4Est.getReinFrsDiameterFact()));
        data4Est.setReinFrsPerimeterSectionEst(SideEstimation.Perimeter(data4Est.getReinFrsDiameterEst()));
        data4Est.setReinFrsClass(Query4User.SetValReinFrsClass());
        System.out.println("Rs = "+data4Est.getReinFrsClass() +" MPa");
        data4Est.setConcreteClass(Query4User.SetValConcreteClass());
        System.out.println("Rbond = "+data4Est.getConcreteClass() +" MPa");
        data4Est.setWorkTypeKf(Query4User.SetValWorkTypeKf());
        System.out.println("Kf = "+data4Est.getWorkTypeKf());
        double BaseAbchLngth = SideEstimation.BaseAnchLngth(data4Est.getReinFrsClass(),
                data4Est.getReinFrsSectionAreaEst(),data4Est.getConcreteClass(),
                data4Est.getReinFrsPerimeterSectionEst());
        System.out.println("Базовая длина анкеровки Lbase=" + BaseAbchLngth + "см");
        double MinAnchLngth = SideEstimation.MinAnchLngth(data4Est.getWorkTypeKf(), BaseAbchLngth,
                data4Est.getReinFrsSectionAreaEst(), data4Est.getReinFrsSectionAreaFact());
        System.out.println("Минимальная длина анкеровки Lmin=" + MinAnchLngth + "см");
    }
}