package school;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception {
        IParams params = SchoolSystem.parse();
        SchoolSystem sc = new SchoolSystem (params.getBig(), params.getMedium(),params.getSmall());
        ArrayList<Integer> plan = params.getPlanSignUp ();
        for (int i = 0; i < plan.size(); i++) {
            sc.addStudent (plan.get(i));
        }
        sc.print();
    }
}
