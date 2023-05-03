import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Delegacion d1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese nombre de la primera Delegacion: ");
        String pais = sc.next();
        System.out.print("Ingrese el numero de deportistas: ");
        int nroDeportistas=Integer.parseInt(sc.next());
        System.out.print("Ingrese numero de medallas de oro: ");
        int oro=Integer.parseInt(sc.next());
        System.out.print("Ingrese numero de medallas de plata: ");
        int plata=Integer.parseInt(sc.next());
        System.out.print("Ingrese numero de medallas de Bronce: ");
        int bronce=Integer.parseInt(sc.next());

        d1=new Delegacion(pais,nroDeportistas,oro,plata,bronce );
//--------------------------------------------------------------------------------------------------------
        Delegacion d2;
        System.out.print("Ingrese nombre de la primera Delegacion: ");
        pais = sc.next();
        System.out.print("Ingrese el numero de deportistas: ");
        nroDeportistas=Integer.parseInt(sc.next());
        System.out.print("Ingrese numero de medallas de oro: ");
        oro=Integer.parseInt(sc.next());
        System.out.print("Ingrese numero de medallas de plata: ");
        plata=Integer.parseInt(sc.next());
        System.out.print("Ingrese numero de medallas de Bronce: ");
        bronce=Integer.parseInt(sc.next());

        d2=new Delegacion(pais,nroDeportistas,oro,plata,bronce );
//--------------------------------------------------------------------------------------------------------
        Delegacion d3;
        System.out.print("Ingrese nombre de la primera Delegacion: ");
        pais = sc.next();
        System.out.print("Ingrese el numero de deportistas: ");
        nroDeportistas=Integer.parseInt(sc.next());
        System.out.print("Ingrese numero de medallas de oro: ");
        oro=Integer.parseInt(sc.next());
        System.out.print("Ingrese numero de medallas de plata: ");
        plata=Integer.parseInt(sc.next());
        System.out.print("Ingrese numero de medallas de Bronce: ");
        bronce=Integer.parseInt(sc.next());

        d3=new Delegacion(pais,nroDeportistas,oro,plata,bronce );
//--------------------------------------------------------------------------------------------------------


        int ch=0;

        while(ch!=4){
        System.out.println("*-*-*-*-*-*-*-*-*-MENU-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("1. Listar delegaciones.");
        System.out.println("2. Modificar medallas de una delegación");
        System.out.println("3. Delegación con más medallas");
        System.out.println("4. Delegación con menos medallas.");
        System.out.println("5. Salir.");
        ch=sc.nextInt();

            switch(ch){
                case 1:
                    System.out.println("---------------Delegaciones---------------");
                    System.out.println("1."+d1.MostrarDelegacion());
                    System.out.println("2."+d2.MostrarDelegacion());
                    System.out.println("3."+d3.MostrarDelegacion());

                case 2:
                    //modificarDelegaciones;
                    break;

                case 3:
                    //masMedallas;
                    if (d1.CalcularCantidadMedallas()>d2.CalcularCantidadMedallas()&&d1.CalcularCantidadMedallas()>d3.CalcularCantidadMedallas()){
                        System.out.println(d1.getPais()+"tiene mas medallas");
                        } else if (d2.CalcularCantidadMedallas()>d1.CalcularCantidadMedallas()&&d2.CalcularCantidadMedallas()>d3.CalcularCantidadMedallas()) {
                        System.out.println(d2.getPais()+"tiene mas medallas");
                    } else if (d3.CalcularCantidadMedallas()>d1.CalcularCantidadMedallas()&&d3.CalcularCantidadMedallas()>d2.CalcularCantidadMedallas()) {
                        System.out.println(d2.getPais()+"tiene mas medallas");
                    }

                    break;

                case 4:
                    //menosMedallas;
                    if (d1.CalcularCantidadMedallas()<d2.CalcularCantidadMedallas()&&d1.CalcularCantidadMedallas()<d3.CalcularCantidadMedallas()){
                        System.out.println(d1.getPais()+"tiene mas medallas");
                    } else if (d2.CalcularCantidadMedallas()<d1.CalcularCantidadMedallas()&&d2.CalcularCantidadMedallas()<d3.CalcularCantidadMedallas()) {
                        System.out.println(d2.getPais()+"tiene mas medallas");
                    } else if (d3.CalcularCantidadMedallas()<d1.CalcularCantidadMedallas()&&d3.CalcularCantidadMedallas()<d2.CalcularCantidadMedallas()) {
                        System.out.println(d2.getPais()+"tiene mas medallas");
                    }
                    break;
                default:
                    System.out.println("Invalid Choice...\n\n");

            }
        }


    }
    }
}