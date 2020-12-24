package pe.edu.upeu.edchp.ResolucionM;

import pe.edu.upeu.edchp.utils.ImprimirArreglos;

public class tarea{

ImprimirArreglos ia=new ImprimirArreglos();

public int[] []transformada001(int dimen, int numInit){
	int[][] matriz=new int[dimen][dimen];
	int item=0; 
	for(int fila=0; fila<dimen;fila++){
		for(int columna=0; columna<dimen;columna++){
			if(columna<dimen-fila){
			item=numInit+(fila+columna)*(fila+columna+1)/2 + fila;
            matriz[fila][columna]=item;
            } 
		}
	}
	return matriz;
}

   

public int[] []transformada002(int dimen, int numInit){
	int[][] matriz=new int[dimen][dimen];
	int item=0; 
	for(int fila=0; fila<dimen;fila++){
		for(int columna=0; columna<dimen;columna++){
			if(columna<dimen-fila){
			item=(fila+columna)*(fila+columna+1)/2 + numInit; 
			matriz[fila][columna]=item; 
		}
	}
}
    return matriz;
}


public int[][] transformada003(final int dimen, final int numInit){
    final int[][] matriz=new int[dimen][dimen];
    int item=0;
    for(int fila=0; fila<dimen;fila++){
        for(int columna=0; columna<dimen;columna++){
            if(columna<dimen-fila){                            
                if((fila+columna)%2==0){
                item=numInit+(fila+columna)*(fila+columna+1)/2 + columna; 
                matriz[fila][columna]=item;
                }else{
                item=numInit+(fila+columna)*(fila+columna+1)/2 + fila; 
                matriz[fila][columna]=item;
                }            
            }
        }
    }
    return matriz;
}

public int[][] transformada004(final int dimen, final int numInit){
    final int[][] matriz=new int[dimen][dimen];
    int item=0;
    for(int fila=0; fila<dimen;fila++){
        for(int columna=0; columna<dimen;columna++){
            if(columna<dimen-fila){                            
                                
                if((fila+columna)%2==0){
                item=numInit+(fila+columna)*(fila+columna+1)/2 + fila; 
                matriz[fila][columna]=item;
                }
                else{
                item=numInit+(fila+columna)*(fila+columna+1)/2 + columna; 
                matriz[fila][columna]=item;
                }                 
                
            }
        }
    }
    return matriz;
}


public int[][] transformada005(final int dimen, int numInit){
    final int[][] matriz=new int[dimen][dimen];
    int contador=0;
    for(int fila=0; fila<matriz.length;fila++){
        for(int columna=matriz[0].length-1; columna>=0;columna--){
            if(contador<=fila){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                contador++;
            }else{
               matriz[fila][columna]=-1; 
            }
        }
        contador=0;
    }
    return matriz;
}
public int[][]transformada006(int dimen, int numInit){
    int[][] matriz=new int [dimen][dimen];
    int x=0;
    for (int i = 0 ;i < dimen ; i++){
        for(int j = 0 ; j <= i ; j++){
            matriz[i][j] = x;
            x++;
        }
    }
    return matriz;
}

public int[] []transformada007(int dimen, int numInit){
	int[][] matriz=new int[dimen][dimen];
	int item=0; 
	for(int fila=0; fila<dimen;fila++){
		for(int columna=0; columna<=dimen;columna++){
			if(columna<dimen-fila){
            matriz[fila][columna]=item;
            item++;
            } 
		}
	}
	return matriz;
    }

public int[][] transformada08(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=matriz.length-1;
    for(int fila=0; fila<matriz.length;fila++){ 
        for(int columna=0; columna<=matriz[0].length-1;columna++){
            if(columna>=fila){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                contador++;
            }else{
               matriz[fila][columna]=0; 
            }
        }
        contador=matriz.length-1;
    }
    return matriz;
}

public int[][] transformada09(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=matriz.length-1;
    for(int fila=0; fila<matriz.length;fila++){
        for(int columna=0; columna<=matriz.length-1;columna++){
            if(contador<=fila){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                
            }else{
               matriz[fila][columna]=0;
               contador--;
            }
        }
        contador=matriz.length-1;
    }
    return matriz;
}
    public int[][] transformada10(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=matriz.length-1;
    for(int fila=0; fila<matriz.length;fila++){
        for(int columna=matriz.length-1; columna>=0;columna--){
            if(contador<=fila){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                
            }else{
               matriz[fila][columna]=0;
               contador--;
            }
        }
        contador=matriz.length-1;
    }
    return matriz;
}


public int[][] transformada11(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=0;
    for(int fila=0; fila<=matriz.length-1;fila++){
        for(int columna=matriz.length-1; columna>=0;columna--){
            if(contador>=fila){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                contador++;
            }else{
               matriz[fila][columna]=0; 
               contador++;
            }
        }
        contador=0;
    }
    return matriz;
}

public int[][] transformada12(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=matriz.length-1;
    for(int fila=0; fila<matriz.length;fila++){
        for(int columna=matriz[0].length-1; columna>=0;columna--){ 
            if(contador>=fila){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                contador--;
            }else{
               matriz[fila][columna]=0; 
            }
        }
        contador=matriz.length-1;
    }
    return matriz;
}

public int[] []transformada013(int dimen, int numInit){
	int[][] matriz=new int[dimen][dimen];
	int item=0; 
	for(int fila=0; fila<dimen;fila++){
		for(int columna=0; columna<=dimen;columna++){
			if(fila<dimen-columna){
            matriz[columna][fila]=item;
            item++;
            } 
		}
	}
	return matriz;
    }    
public int[] []transformada014(int dimen, int numInit){
	int[][] matriz=new int[dimen][dimen];
	int item=0; 
	for(int fila=0; fila<dimen;fila++){
		for(int columna=0; columna<=dimen;columna--){
			if(fila<dimen-columna){
            matriz[fila][columna]=item;
            item++;
            } 
		}
	}
	return matriz;
    }   
public int[][] transformada16(final int dimen, int numInit){
    final int[][] matriz=new int[dimen][dimen];
    int contador=0;
    for(int fila=0; fila<matriz.length;fila++){
        for(int columna=matriz[0].length-1; columna>=0;columna--){
            if(contador<=fila){                            
                matriz[columna][fila]= numInit;                                                                
                numInit++;
                contador++;
            }else{
               matriz[columna][fila]=0; 
            }
        }
        contador=0;
    }
    return matriz;
}
public int[][] transformada21(final int dimen, int numInit){
    final int[][] matriz=new int[dimen][dimen];
    int fila=0;
    numInit=dimen*dimen-1;
    for(int columna=matriz[0].length-1; columna>=0;columna--){
        if(fila!=-1){
            for(fila=matriz.length-1; fila>=0;fila--){
                matriz[fila][columna]=numInit;
                numInit--;
            }
        }else{
            for(fila=0; fila<matriz.length;fila++){
                matriz[fila][columna]=numInit;
                numInit--;
            }            
        }        
    }
    return matriz;
}

public int[][] transformada23(final int dimen, int numInit){
    final int[][] matriz=new int[dimen][dimen];
    int fila=0;
    for(int columna=matriz[0].length-1; columna>=0;columna--){
        if(fila!=5){
            for(fila=0; fila<matriz.length;fila++){
                matriz[fila][columna]=numInit;
                numInit++;
            }                        
        }else{
            for(fila=matriz.length-1; fila>=0;fila--){
                matriz[fila][columna]=numInit;
                numInit++;
            }                      
        }        
    }
    return matriz;
}

public int[][] transformada24(final int dimen, int numInit){
    final int[][] matriz=new int[dimen][dimen];
    int fila=0;
    for(int columna=matriz[0].length-1; columna>=0;columna--){
        if(fila!=-1){
            for(fila=matriz.length-1; fila>=0;fila--){
                matriz[fila][columna]=numInit;
                numInit++;
            }
        }else{
            for(fila=0; fila<matriz.length;fila++){
                matriz[fila][columna]=numInit;
                numInit++;
            }            
        }        
    }
    return matriz;
}
public int[][] transformada25(final int dimen, int numInit){
    final int[][] matriz=new int[dimen][dimen];
    int fila=0;
    numInit=dimen*dimen-1;
    for(int columna=matriz[0].length-1; columna>=0;columna--){
        if(fila!=-1){
            for(fila=matriz.length-1; fila>=0;fila--){
                matriz[columna][fila]=numInit;
                numInit--;
            }
        }else{
            for(fila=0; fila<matriz.length;fila++){
                matriz[columna][fila]=numInit;
                numInit--;
            }            
        }        
    }
    return matriz;
}

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

public int[][] transformada27(final int dimen, int numInit){
    final int[][] matriz=new int[dimen][dimen];
    int fila=0;
    for(int columna=matriz[0].length-1; columna>=0;columna--){
        if(fila!=-1){
            for(fila=matriz.length-1; fila>=0;fila--){
                matriz[columna][fila]=numInit;
                numInit++;
            }
        }else{
            for(fila=0; fila<matriz.length;fila++){
                matriz[columna][fila]=numInit;
                numInit++;
            }            
        }        
    }
    return matriz;
}
public int[][] transformada28(final int dimen, int numInit){
    final int[][] matriz=new int[dimen][dimen];
    int fila=0;
    for(int columna=matriz[0].length-1; columna>=0;columna--){
        if(fila!=5){
            for(fila=0; fila<matriz.length;fila++){
                matriz[columna][fila]=numInit;
                numInit++;
            }                        
        }else{
            for(fila=matriz.length-1; fila>=0;fila--){
                matriz[columna][fila]=numInit;
                numInit++;
            }                      
        }        
    }
    return matriz;
}
public int[][] transformada29(final int dimen, int numInit){
    final int[][] matriz=new int[dimen][dimen];
    for(int v=0; v<dimen/2; v++){
        for(int ls=v;ls<dimen-1-v; ls++){
            matriz[v][ls]=numInit;
            numInit++;            
        }
        for(int ld=v;ld<dimen-1-v; ld++){
            matriz[ld][dimen-1-v]=numInit;
            numInit++;            
        }        
        for(int li=dimen-1-v;li>v; li--){
            matriz[dimen-1-v][li]=numInit;
            numInit++;            
        }  
        for(int liz=dimen-1-v;liz>v; liz--){
            matriz[liz][v]=numInit;
            numInit++;            
        }              
    }
    if(dimen%2!=0){
        matriz[dimen/2][dimen/2]=numInit;
    }

    return matriz;
}
public int[][] transformada30(final int dimen, int numInit){
    final int[][] matriz=new int[dimen][dimen];
    for(int v=0; v<dimen/2; v++){
        for(int ls=dimen;ls<dimen-1-v; ls++){
            matriz[v][ls]=numInit;
            numInit++;            
        }
        for(int ld=v;ld<dimen-1-v; ld++){
            matriz[ld][dimen-1-v]=numInit;
            numInit++;            
        }        
        for(int li=dimen-1-v;li>v; li--){
            matriz[dimen-1-v][li]=numInit;
            numInit++;            
        }  
        for(int liz=dimen-1-v;liz>v; liz--){
            matriz[liz][v]=numInit;
            numInit++;            
        }              
    }
    if(dimen%2!=0){
        matriz[dimen/2][dimen/2]=numInit;
    }

    return matriz;
}

public int[][] transformada35(final int dimen, int numInit){
    final int[][] matriz=new int[dimen][dimen];
    int x, x1, x2, y, y1;
    for(x=matriz.length-1; x>=matriz.length/2; x--){
        for(y=(dimen-1)-x;y<=x;y++){
            matriz[x][y]=numInit;
            numInit++;
        }
        for(x1=y-2;x1>=(dimen-1)-x;x1--){
            matriz[x1][x]=numInit;
            numInit++;
        }   
        for(y1=y-2;y1>=(dimen-1)-x;y1--){
            matriz[x1+1][y1]=numInit;
            numInit++;
        }   
        for(x2=y1+2;x2<y-1;x2++){
            matriz[x2][y1+1]=numInit;
            numInit++;
        }                    
    }

    return matriz;
}

public int[][] transformada31(final int dimen, int numInit){
    final int[][] matriz=new int[dimen][dimen];
    int x, x1, x2, y, y1;
    for(x=matriz.length-1; x>=matriz.length/2; x--){
        for(y=(dimen-1)-x;y<=x;y++){
            matriz[x][y]=numInit;
            numInit++;
        }
        for(x1=y-2;x1>=(dimen-1)-x;x1--){
            matriz[x1][x]=numInit;
            numInit++;
        }   
        for(y1=y-2;y1>=(dimen-1)-x;y1--){
            matriz[x1+1][y1]=numInit;
            numInit++;
        }   
        for(x2=y1+2;x2<y-1;x2++){
            matriz[x2][y1+1]=numInit;
            numInit++;
        }                    
    }

    return matriz;
}
     public static void main( String[] args) {
   tarea mt=new tarea(); 
   mt.ia.imprimirMatriz(mt.transformada31(5, 0));
}

}