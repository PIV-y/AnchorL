package AnchorLengthEst;

public class Data4Est {
    private double ReinFrsDiameterEst;
    private double ReinFrsDiameterFact;
    private double ReinFrsSectionAreaEst; //Расчетная площадь сечения арматуры
    private double ReinFrsSectionAreaFact; //Фактическое площадь сечения арматуры
    private double ReinFrsPerimeterSectionEst; //Длина окружности арматуры (Us)
    private double ReinFrsClass; //Значение Rs арматуры по классу
    private double ConcreteClass; //Значение Rbond бетона по классу
    private double WorkTypeKf; //коэффициент условии работы

    public void setReinFrsDiameterEst(double Diameter){
        ReinFrsDiameterEst = Diameter;
    }
    public double getReinFrsDiameterEst(){
        return ReinFrsDiameterEst;
    }
    public void setReinFrsDiameterFact(double Diameter){
        ReinFrsDiameterFact = Diameter;
    }
    public double getReinFrsDiameterFact(){
        return ReinFrsDiameterFact;
    }
    public void setReinFrsSectionAreaEst(double SectionAreaEst){
        ReinFrsSectionAreaEst = SectionAreaEst;
    }
    public double getReinFrsSectionAreaEst(){
        return ReinFrsSectionAreaEst;
    }
    public void setReinFrsSectionAreaFact(double SectionAreaFact){
        ReinFrsSectionAreaFact = SectionAreaFact;
    }
    public double getReinFrsSectionAreaFact(){
        return ReinFrsSectionAreaFact;
    }
    public void setReinFrsPerimeterSectionEst(double PerimeterSectionEst){
        ReinFrsPerimeterSectionEst = PerimeterSectionEst;
    }
    public double getReinFrsPerimeterSectionEst(){
        return ReinFrsPerimeterSectionEst;
    }
    public void setReinFrsClass(double Class){
        ReinFrsClass = Class;
    }
    public double getReinFrsClass(){
        return ReinFrsClass;
    }
    public void setConcreteClass(double Class){
        ConcreteClass = Class;
    }
    public double getConcreteClass(){
        return ConcreteClass;
    }
    public void setWorkTypeKf(double Kf){
        WorkTypeKf = Kf;
    }
    public double getWorkTypeKf(){
        return WorkTypeKf;
    }
}