package PrFfuncional;



public class ProgFuncional {
    public static void main(String[] args) {
        
        String[][] cesta = {{"Nutella", "100.0"}, {"Jabon", "50.0"}, {"Salsa", "80.0"}};

        
        double precioFinalDescuento = descuentoCesta(cesta, 10);
        System.out.println("El precio final de la cesta con descuento es: " + precioFinalDescuento);

        
        double precioFinalIVA = aplicarIVACesta(cesta, 16);
        System.out.println("El precio final de la cesta con IVA es: " + precioFinalIVA);
    }

    
    public static double sacarDescuento(double precio, double descuento) {
        double aplicarDesc = descuento / 100;
        return precio - (aplicarDesc * precio);
    }

    
    public static double aplicarIVA(double precio, double porcentajeIVA) {
        double aplicarIVA = porcentajeIVA / 100;
        return precio * (1 + aplicarIVA);
    }

    
    public static double descuentoCesta(String[][] cesta, double descuento) {
        double precioFinal = 0;
        for (String[] producto : cesta) {
            double precio = Double.parseDouble(producto[1]);
            precioFinal += sacarDescuento(precio, descuento);
        }
        return precioFinal;
    }

    
    public static double aplicarIVACesta(String[][] cesta, double porcentajeIVA) {
        double precioFinal = 0;
        for (String[] producto : cesta) {
            double precio = Double.parseDouble(producto[1]);
            precioFinal += aplicarIVA(precio, porcentajeIVA);
        }
        return precioFinal;
    }
}
	 


