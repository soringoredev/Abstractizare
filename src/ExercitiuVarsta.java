import java.util.Scanner;

public class ExercitiuVarsta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti varsta: ");

        int varstaIntrodusa = sc.nextInt();

        if (varstaIntrodusa >= 1 && varstaIntrodusa <= 12) {
            System.out.println("Copil");
        } else if (varstaIntrodusa >= 13 && varstaIntrodusa <=17) {
            System.out.println("Adolescent");
        } else if (varstaIntrodusa >= 18 && varstaIntrodusa <=111) {
            System.out.println("Adult");
        } else {
            System.out.println("Eroare!");
        }


    }
}
