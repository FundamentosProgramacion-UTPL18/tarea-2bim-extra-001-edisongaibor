
package deberarreglo;

public class DeberArreglo {

    public static void main(String[] args) {
        //Declaracion e Inicializacion de Variables
        double sumatotal,promediototal,sumatotal2 = 0;
        String cadena;
        String [] meses = {"Agosto", "Octubre","Diciembre"};
        String [] sucursales = {"sucursal 1", "sucursal 2", "sucursal 3", "sucursal 4"};
        double [] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double [] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double [] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};
        double [] venta_total_sucursal = new double[4];
        double [] venta_promedio_sucursal = new double[4];
        
        //Formateo de cadena
        
        cadena=String.format("Reporte\n\n\t\t%-12s%-12s%-12s%-12s%-12s\n",meses[0],meses[1],meses[2],"Total","Promedio");
        
        //CiclosFor
        
        for(int contador=0;contador<=meses.length;contador++){
            sumatotal=ventas_mes_1[contador] + ventas_mes_2[contador] + ventas_mes_3[contador];
            promediototal=sumatotal / meses.length;
            venta_total_sucursal[contador]=sumatotal;
            venta_promedio_sucursal[contador]=promediototal;
        
            cadena=cadena + String.format("%-16s%-12.2f%-12.2f%-12.2f%-12.2f%-12.2f\n",sucursales[contador],ventas_mes_1[contador],ventas_mes_2[contador],ventas_mes_3[contador],venta_total_sucursal[contador],venta_promedio_sucursal[contador]);
        }
        

        
        for(int contador=0;contador< venta_total_sucursal.length;contador++){
            sumatotal2 = venta_total_sucursal[contador] + sumatotal2;
        }
        
        //Formateo de Cadena
        cadena = cadena + String.format("\n\nTotal de ventas de todas las sucursales:\t%.2f",sumatotal2);
        //Impresion de Cadena
        System.out.println(cadena);
        
        
    
    
    
        
        
       
    }
    
}
