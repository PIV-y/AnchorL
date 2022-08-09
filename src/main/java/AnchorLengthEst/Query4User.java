package AnchorLengthEst;

import java.util.Scanner;

public class Query4User {
    public static double SetValReinFrsDiameterEst() {
        Scanner console = new Scanner(System.in);
        System.out.println("Диаметр расчетной арматуры, см: ");
        double ReinFrsDiameterEst = console.nextDouble();
        System.out.println("d=" + ReinFrsDiameterEst + "см");
        return ReinFrsDiameterEst;
    }

    public static double SetValReinFrsDiameterFact() {
        Scanner console = new Scanner(System.in);
        System.out.println("Диаметр фактически применяемой арматуры, см: ");
        double ReinFrsDiameterFact = console.nextDouble();
        System.out.println("d=" + ReinFrsDiameterFact + "см");
        return ReinFrsDiameterFact;
    }
    public static double SetValReinFrsClass(){
        Scanner console = new Scanner(System.in);
        String dbTbl = "reinforcement";
        String IndxParameter = "A";
        String measure = "MPa (Rs)";
        String query2user = "Выбери пункт с классом арматуры:";
        DataBase.db_connect(dbTbl, IndxParameter, measure, query2user);
        String IDfromUser = console.next();
        return DataBase.db_fetch(dbTbl, IDfromUser);
    }
    public static double SetValConcreteClass(){
        Scanner console = new Scanner(System.in);
        String dbTbl = "concrete";
        String IndxParameter = "B";
        String measure = "MPa (Rbond)";
        String query2user = "Выбери пункт с классом бетонна:";
        DataBase.db_connect(dbTbl, IndxParameter, measure, query2user);
        String IDcncrtFromIser = console.next();
        return DataBase.db_fetch(dbTbl, IDcncrtFromIser);
    }

    public static double SetValWorkTypeKf(){
        Scanner console = new Scanner(System.in);
        String dbTbl = "kfworktype";
        String IndxParameter = "";
        String measure = "";
        String query2user = "Выберите пункт с типом работы арматуры в бетоне:";
        DataBase.db_connect(dbTbl, IndxParameter, measure, query2user);
        String IDWorkTypeKfFromUser = console.next();
        return DataBase.db_fetch(dbTbl, IDWorkTypeKfFromUser);
    }
}
