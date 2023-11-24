import java.util.Scanner;
public class Main {
    public static void main(String []args){
        Scanner entrada=new Scanner(System.in);

        double []Redes = new double[0];
        double []Sistemas=new double[0];
        double []POO=new double[0];
        double []Algoritmos=new double[0];
        double []Gestion=new double[0];

        Estudiante estudiante_uno, estudiante_dos;
        estudiante_uno=new Estudiante("Mateo", "Bernal","Redes", "Sistemas","POO","Algoritmos","Gestion");
        estudiante_dos=new Estudiante("Emilio", "Erazo","Redes", "Sistemas","POO","Algoritmos","Gestion");

        for (int i=0; i<2;i++){
            System.out.println("\n\t\t\t\tESTUDIANTE "+(i+1));
            System.out.println("\t\tBIMESTRE 1");
            System.out.print("Ingrese la nota del bimestre 1 de REDES: ");Redes[i]= entrada.nextDouble();
            System.out.print("Ingrese la nota del bimestre 1 de SISTEMAS: ");Sistemas[i]= entrada.nextDouble();
            System.out.print("Ingrese la nota del bimestre 1 de POO: ");
            System.out.print("Ingrese la nota del bimestre 1 de ALGORITMOS: ");
            System.out.print("Ingrese la nota del bimestre 1 de GESTIENO: ");

            System.out.println("\n\t\tBIMESTRE 2");
            System.out.print("Ingrese la nota del bimestre 2 de REDES: ");
            System.out.print("Ingrese la nota del bimestre 2 de SISTEMAS: ");
            System.out.print("Ingrese la nota del bimestre 2 de POO: ");
            System.out.print("Ingrese la nota del bimestre 2 de ALGORIMOS: ");
            System.out.print("Ingrese la nota del bimestre 2 de GESTION: ");
            //nota=entrada.nextDouble(estudiante_uno.setCalificacion_uno_materia_uno());


        }


    }
}