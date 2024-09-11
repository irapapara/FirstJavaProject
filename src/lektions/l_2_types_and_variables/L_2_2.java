package lektions.l_2_types_and_variables;

public class L_2_2 {
    public static void main(String[] args) {
        int regular = 75;
        int doppel = 10;
        int archers = 30;
        int leut = 2;
        int captain =1;
        int baseSalary= 4;
        //int summa= 100*4+20*80+2*40+1*400;
        int summa = regular*baseSalary+
                (archers+doppel)*2*baseSalary+
                leut*10*baseSalary+
                captain*100*baseSalary;
        System.out.println(summa);
    }
}
