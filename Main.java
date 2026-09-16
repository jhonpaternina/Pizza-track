import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        GestionPedidos gp = new GestionPedidos();
        int op=1;
        while(op!=0){
            System.out.println("\n1 registrar 2 deshacer 3 rehacer 4 ver 0 salir");
            op=sc.nextInt(); sc.nextLine();
            if(op==1){
                System.out.print("nombre: "); String n=sc.nextLine();
                System.out.print("ing1: "); String a=sc.nextLine();
                System.out.print("ing2: "); String b=sc.nextLine();
                System.out.print("ing3: "); String c=sc.nextLine();
                gp.registrar(new Pizza(n,a,b,c));
            }
            if(op==2) gp.deshacer();
            if(op==3) gp.rehacer();
            if(op==4) gp.actual();
        }
    }
}