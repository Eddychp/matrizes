package pe.edu.upeu.edchp.ResolucionM.examen;

public class hhh {
public static void main(String[] args) {

        int [][] matriz1 = new int[][] { {41,4,8}, {12,16,20},{4,10,6} };
        int [][] matriz2 = new int[][] { {40,2,4}, {6,8,10},{2,5,3} };
        RESTA (matriz1, matriz2);
    }

    public static int[][] RESTA (int[][] matrizA , int[][] matrizB) {
        int[][] matrizResultado;
        int filasA =matrizA.length;
        int columnasA = matrizA[0].length;

        int filasB =matrizB.length;
        int columnasB = matrizB[0].length;

        System.out.println("Primera matriz:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print(matrizA[i][j] + "   ");
            }
            System.out.println("");
        }

        System.out.println("Segunda matriz:");
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(matrizB[i][j] + "   ");
            }
            System.out.println("");
        }

        if (filasA==filasB && columnasB==columnasA) {

            matrizResultado = new int[filasA][columnasA];
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasA; j++) {
                    matrizResultado[i][j] = matrizA[i][j] - matrizB[i][j];
                }
            }

        } else {
            throw new Error("Las matrices deben tener la misma cantidad de filas que columnas");
        }
                for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA.length; j++) {
                System.out.print("[ " + matrizA[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  +   ");
            } else {
                System.out.print("      ");
            }                        

            for (int j = 0; j < matrizB.length; j++) {
                System.out.print("[ " + matrizB[i][j] + " ]");
            }
            
            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }
            
            for (int j = 0; j < matrizResultado.length; j++) {
                System.out.print("[ " + matrizResultado[i][j] + " ]");
            }

            System.out.println("");
        }

    


        return matrizResultado;
    }
}

