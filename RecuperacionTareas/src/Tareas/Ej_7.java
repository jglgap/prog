package Tareas;

public class Ej_7 {

    public static void diamante(int n, char c){
      if( n%2==1 && n<=33 && n>=1 ){
        for (int i=1; i<=n-2; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for (int x = 1; x<=2*i - 1; x++) {
                System.out.print(c);
            }

            System.out.println();
        }
    
        for(int i=n-3;i>0;i--){
            for(int j=0;j<n-2;j++){
                System.out.print(" ");
            }
            for(int x=1;x<=2*i-1;x++){
                System.out.print(c);
            }
            System.out.println();
        }

        
    }else {System.out.println("error");}
}

    public static void main(String[] args) {
        diamante(5, '#');
    }
}
