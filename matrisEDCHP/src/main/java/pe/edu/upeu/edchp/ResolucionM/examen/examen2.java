package pe.edu.upeu.edchp.ResolucionM.examen;
import pe.edu.upeu.edchp.utils.ImprimirArreglos;
public class examen2 {
    ImprimirArreglos ia=new ImprimirArreglos();    
    public int[][] transformada26(final int dimen, int numInit){
    final int[][] matriz=new int[dimen][dimen];
    int fila=0;
    numInit=dimen*dimen-1;
    for(int columna=matriz[0].length-1; columna>=0;columna--){
        if(fila!=5){
            for(fila=0; fila<matriz.length;fila++){
                matriz[columna][fila]=numInit;
                numInit--;
            }                        
        }else{
            for(fila=matriz.length-1; fila>=0;fila--){
                matriz[columna][fila]=numInit;
                numInit--;
            }                      
        }        
    }
    return matriz;
}
     public static void main( String[] args) {
   examen2 mt=new examen2(); 
   mt.ia.imprimirMatriz(mt.transformada26(5, 0));
}
}