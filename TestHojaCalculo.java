/**
 *  Clase con código para probar el resto de clases
 * 
 * @author - 
 *  
 */
public class TestHojaCalculo
{
    private Fecha fecha1;
    private Fecha fecha2;
    private Fecha fecha3;
    private HojaCalculo hoja;
    private Fila fila1;
    private Fila fila2;
    private Fila fila3;
    /**
     * Constructor  
     */
    public TestHojaCalculo()    {
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 1
     * incluyendo la hoja duplicada
     * La fila4 que no se podrá guardar puedes crearla con el constructor por defecto
     * de fila (el que no tiene parámetros)
     */
    public void test1(String id, double ingresos, double gastos) {
         HojaCalculo hoja = new HojaCalculo("Hoja1");
         fecha1 = new Fecha(4, 10, 2020);
         fecha2 = new Fecha(5, 10, 2020);
         fecha3 = new Fecha(1, 1, 2020);
         hoja.addFila("Fila1", fecha1, 25.50, 132);
         hoja.addFila("Fila2", fecha2, 300, 350);
         hoja.addFila("Fila3", fecha3, 0, 0);
         hoja.addFila("Fila4", fecha1, 32, 123);
         hoja.toString();
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 2 
     * incluyendo la hoja duplicada
     *  
     */
    public void test2() {
         HojaCalculo hoja = new HojaCalculo("Hoja2");
         fecha1 = new Fecha(7, 10, 2020);
         fecha2 = new Fecha(8, 10, 2020);
         hoja.addFila("Fila1", fecha1, 260, 125);
         hoja.addFila("Fila2", fecha2, 125, 245);
         hoja.toString();
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 3
     * incluyendo la hoja duplicada
     *  
     */
    public void test3() {
        HojaCalculo hoja = new HojaCalculo("Hoja3");  
        fecha1 = new Fecha(8, 10, 2020);
        hoja.addFila("Fila1", fecha1, 670, 234);
    }

}
