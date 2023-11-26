import java.util.Scanner;
public class Main {
    public static void main(String []args){

        Scanner entrada=new Scanner(System.in);

        double []Redes_uno = new double[10];
        double []Sistemas_uno=new double[10];
        double []POO_uno=new double[10];
        double []Algoritmos_uno=new double[10];
        double []Gestion_uno=new double[10];

        double []Redes_dos = new double[10];
        double []Sistemas_dos=new double[10];
        double []POO_dos=new double[10];
        double []Algoritmos_dos=new double[10];
        double []Gestion_dos=new double[10];

        double []promedio_redes = new double[10];
        double []promedio_sistemas = new double[10];
        double []promedio_POO = new double[10];
        double []promedio_algoritmos = new double[10];
        double []promedio_gestion = new double[10];

        //clase materias
        Materias materias;
        materias= new Materias("Redes","Sistemas","POO","Algoritmos","Gestion");

        //clase estudiante
        Estudiante estudiante_uno, estudiante_dos;
        estudiante_uno=new Estudiante("12236894","Mateo", "Bernal",19);
        estudiante_dos=new Estudiante("29222356","Emilio", "Erazo",20);

        for (int i=0; i<2;i++){
            System.out.println("\n\t\tESTUDIANTE "+(i+1));
            System.out.println("\t\tBIMESTRE 1");
            System.out.print("Ingrese la nota del bimestre 1 de "+materias.materia_uno+": ");Redes_uno[i]= entrada.nextDouble();
            System.out.print("Ingrese la nota del bimestre 1 de "+materias.materia_dos+": ");Sistemas_uno[i]= entrada.nextDouble();
            System.out.print("Ingrese la nota del bimestre 1 de "+materias.materia_tres+": ");POO_uno[i]= entrada.nextDouble();
            System.out.print("Ingrese la nota del bimestre 1 de "+materias.materia_cuatro+": ");Algoritmos_uno[i]= entrada.nextDouble();
            System.out.print("Ingrese la nota del bimestre 1 de "+materias.materia_cinco+": ");Gestion_uno[i]=entrada.nextDouble();

            System.out.println("\n\t\tBIMESTRE 2");
            System.out.print("Ingrese la nota del bimestre 2 de "+materias.materia_uno+": ");Redes_dos[i]= entrada.nextDouble();
            System.out.print("Ingrese la nota del bimestre 2 de "+materias.materia_dos+": ");Sistemas_dos[i]= entrada.nextDouble();
            System.out.print("Ingrese la nota del bimestre 2 de "+materias.materia_tres+": "); POO_dos[i]= entrada.nextDouble();
            System.out.print("Ingrese la nota del bimestre 2 de "+materias.materia_cuatro+": "); Algoritmos_dos[i]=entrada.nextDouble();
            System.out.print("Ingrese la nota del bimestre 2 de "+materias.materia_cinco+": "); Gestion_dos[i]= entrada.nextDouble();

        }

        for (int i=0;i<2;i++){
            promedio_redes[i]=(Redes_uno[i]+Redes_dos[i])/2;
            promedio_sistemas[i]=(Sistemas_uno[i]+Sistemas_dos[i])/2;
            promedio_POO[i]=(POO_uno[i]+POO_dos[i])/2;
            promedio_algoritmos[i]=(Algoritmos_uno[i]+Algoritmos_dos[i])/2;
            promedio_gestion[i]=(Gestion_uno[i]+Gestion_dos[i])/2;
        }

        for (int i=0; i<2; i++){
            System.out.println("\n\t\tESTUDIANTE "+(i+1));
            if (promedio_redes[i]<14){
                System.out.println("El estudiante "+(i+1)+" REPROBO "+materias.materia_uno);
            }
            else{
                System.out.println("El estudiante "+(i+1)+" APROBO "+materias.materia_uno);
            }

            if (promedio_sistemas[i]<14){
                System.out.println("El estudiante "+(i+1)+" REPROBO "+materias.materia_dos);
            }
            else{
                System.out.println("El estudiante "+(i+1)+" APROBO "+materias.materia_dos);
            }

            if (promedio_POO[i]<14){
                System.out.println("El estudiante "+(i+1)+" REPROBO "+materias.materia_tres);
            }
            else{
                System.out.println("El estudiante "+(i+1)+" APROBO "+materias.materia_tres);
            }

            if (promedio_algoritmos[i]<14){
                System.out.println("El estudiante "+(i+1)+" REPROBO "+materias.materia_cuatro);
            }
            else{
                System.out.println("El estudiante "+(i+1)+" APROBO "+materias.materia_cuatro);
            }

            if (promedio_gestion[i]<14){
                System.out.println("El estudiante "+(i+1)+" REPROBO "+materias.materia_cinco);
            }
            else{
                System.out.println("El estudiante "+(i+1)+" APROBO "+materias.materia_cinco);
            }

        }

    }
}