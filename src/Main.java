import java.util.Scanner;
public class Main {
    public static void main(String []args){
        Scanner entrada=new Scanner(System.in);

        double []Redes;
        double []Sistemas;
        double []POO;
        double []Algoritmos;
        double []Gestion;

        Estudiante estudiante_uno, estudiante_dos;
        estudiante_uno=new Estudiante("Mateo", "Bernal","Redes", "Sistemas","POO","Algoritmos","Gestion");
        estudiante_dos=new Estudiante("Emilio", "Erazo","Redes", "Sistemas","POO","Algoritmos","Gestion");

        for (int i=0; i<2;i++){
            System.out.println("\n\t\t\t\tESTUDIANTE "+(i+1));
            System.out.print("Ingrese la nota del bimestre 1 de Redes: ");
            System.out.print("Ingrese la nota del bimestre 2 de Redes: ");
            System.out.print("Ingrese la nota del bimestre 1 de Sistemas: ");
            System.out.print("Ingrese la nota del bimestre 2 de Sistemas: ");
            System.out.print("Ingrese la nota del bimestre 1 de POO: ");
            System.out.print("Ingrese la nota del bimestre 2 de POO: ");
            System.out.print("Ingrese la nota del bimestre 1 de ALGORITMOS: ");
            System.out.print("Ingrese la nota del bimestre 2 de ALGORIMOS: ");
            System.out.print("Ingrese la nota del bimestre 1 de GESTIENO: ");
            System.out.print("Ingrese la nota del bimestre 2 de GESTION: ");

            String nombre = entrada.nextLine();
        }


    }
}