package AnchorLengthEst;

public class StartEstimation {
    public static void startestimation() {
        ParametersForEstimation CurrentEstObjParameters = new ParametersForEstimation();
        CurrentEstObjParameters.setReinFrsDiameterEst(QestionsForUser.SetValReinFrsDiameterEst());
        CurrentEstObjParameters.setReinFrsDiameterFact(QestionsForUser.SetValReinFrsDiameterFact());
        CurrentEstObjParameters.setReinFrsSectionAreaEst(SideEstimation.SectionArea(CurrentEstObjParameters.getReinFrsDiameterEst()));
        CurrentEstObjParameters.setReinFrsSectionAreaFact(SideEstimation.SectionArea(CurrentEstObjParameters.getReinFrsDiameterFact()));
        CurrentEstObjParameters.setReinFrsPerimeterSectionEst(SideEstimation.Perimeter(CurrentEstObjParameters.getReinFrsDiameterEst()));
        CurrentEstObjParameters.setReinFrsClass(QestionsForUser.SetValReinFrsClass());
        System.out.println("Rs = " + CurrentEstObjParameters.getReinFrsClass() + " MPa");
        CurrentEstObjParameters.setConcreteClass(QestionsForUser.SetValConcreteClass());
        System.out.println("Rbond = " + CurrentEstObjParameters.getConcreteClass() + " MPa");
        CurrentEstObjParameters.setWorkTypeKf(QestionsForUser.SetValWorkTypeKf());
        System.out.println("Kf = " + CurrentEstObjParameters.getWorkTypeKf());
        double BaseAnchLngth = SideEstimation.BaseAnchLngth(CurrentEstObjParameters.getReinFrsClass(),
                CurrentEstObjParameters.getReinFrsSectionAreaEst(), CurrentEstObjParameters.getConcreteClass(),
                CurrentEstObjParameters.getReinFrsPerimeterSectionEst());
        System.out.println("Базовая длина анкеровки Lbase=" + BaseAnchLngth + "см");
        double MinAnchLngth = SideEstimation.MinAnchLngth(CurrentEstObjParameters.getWorkTypeKf(), BaseAnchLngth,
                CurrentEstObjParameters.getReinFrsSectionAreaEst(), CurrentEstObjParameters.getReinFrsSectionAreaFact());
        System.out.println("Минимальная длина анкеровки Lmin=" + MinAnchLngth + "см");
        double Ln = SideEstimation.OverlapLength(CurrentEstObjParameters.getWorkTypeKf(), BaseAnchLngth,
                CurrentEstObjParameters.getReinFrsSectionAreaEst(), CurrentEstObjParameters.getReinFrsSectionAreaFact());
        System.out.println("Минимальная длина нахлеста Ln=" + Ln + "см");
    }
}