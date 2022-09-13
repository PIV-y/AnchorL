package AnchorLengthEst;

import java.util.Scanner;

public class QestionsForUser {
    public static double SetValReinFrsDiameterEst() {
        System.out.println("Диаметр расчетной арматуры, см: ");
        double ReinFrsDiameterEst = 0;
        while (ReinFrsDiameterEst == 0){
            Scanner console = new Scanner(System.in);
            if (console.hasNextDouble()){
                ReinFrsDiameterEst = console.nextDouble();
                if (ReinFrsDiameterEst == 0)
                    System.out.println("Введите положительное цифровое значение");}
            else
                System.out.println("Введите положительное цифровое значение");
        }
        System.out.println("d=" + ReinFrsDiameterEst + "см");
        return ReinFrsDiameterEst;
    }
    public static double SetValReinFrsDiameterFact() {
        System.out.println("Диаметр фактически применяемой арматуры, см: ");
        double ReinFrsDiameterFact = 0;
        while (ReinFrsDiameterFact == 0){
            Scanner console = new Scanner(System.in);
            if (console.hasNextDouble()){
                ReinFrsDiameterFact = console.nextDouble();
                if (ReinFrsDiameterFact == 0)
                    System.out.println("Введите положительное цифровое значение");}
            else
                System.out.println("Введите положительное цифровое значение");
        }
        System.out.println("d=" + ReinFrsDiameterFact + "см");
        return ReinFrsDiameterFact;
    }
    public static double SetValReinFrsClass(){
        String dbTbl = "reinforcement";
        String IndxParameter = "A";
        String measure = "MPa (Rs)";
        String query2user = "Выбери пункт с классом арматуры:";
        DataBase.db_connect(dbTbl, IndxParameter, measure, query2user);
        int IDfromUser = 0;
        while (IDfromUser < 1 || IDfromUser > 2){
            Scanner console = new Scanner(System.in);
            if (console.hasNextInt()){
                IDfromUser = console.nextInt();
                if (IDfromUser < 1 || IDfromUser > 2)
                    System.out.println("Введите пункт из предоставленного списка");}
            else
                System.out.println("Введите пункт из предоставленного списка");
        }
        return DataBase.Read(dbTbl, Integer.toString(IDfromUser));
    }
    public static double SetValConcreteClass(){
        String dbTbl = "concrete";
        String IndxParameter = "B";
        String measure = "MPa (Rbond)";
        String query2user = "Выбери пункт с классом бетонна:";
        DataBase.db_connect(dbTbl, IndxParameter, measure, query2user);
        int IDcncrtFromIser = 0;
        while (IDcncrtFromIser < 1 || IDcncrtFromIser > 6){
            Scanner console = new Scanner(System.in);
            if (console.hasNextInt()){
                IDcncrtFromIser = console.nextInt();
                if (IDcncrtFromIser < 1 || IDcncrtFromIser > 6)
                    System.out.println("Введите пункт из предоставленного списка");}
            else
                System.out.println("Введите пункт из предоставленного списка");
        }
        return DataBase.Read(dbTbl, Integer.toString(IDcncrtFromIser));
    }
    public static double SetValWorkTypeKf(){
        String dbTbl = "kfworktype";
        String IndxParameter = "";
        String measure = "";
        String query2user = "Выберите пункт с типом работы арматуры в бетоне:";
        DataBase.db_connect(dbTbl, IndxParameter, measure, query2user);
        int IDWorkTypeKfFromUser = 0;
        while (IDWorkTypeKfFromUser < 1 || IDWorkTypeKfFromUser > 3){
            Scanner console = new Scanner(System.in);
            if (console.hasNextInt()){
                IDWorkTypeKfFromUser = console.nextInt();
                if (IDWorkTypeKfFromUser < 1 || IDWorkTypeKfFromUser > 3)
                    System.out.println("Введите пункт из предоставленного списка");}
            else
                System.out.println("Введите пункт из предоставленного списка");
        }
        return DataBase.Read(dbTbl, Integer.toString(IDWorkTypeKfFromUser));
    }
}
