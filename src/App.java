public class App {
    public static void main(String[] args) throws Exception {
        
        Cuaderno cuaderno1 =new Cuaderno("top",20,100,"carta");
        Cuaderno cuaderno2 =new Cuaderno("lider",15,180,"oficio");
        //cuaderno1.leer();
        //cuaderno2.leer();
        cuaderno1.mostrar();
        cuaderno2.mostrar();
        //b)
        System.out.println("--------------------------");
        cuaderno1.verificarhojas(100);
        //c)
        System.out.println("--------------------------");
        cuaderno1.mayorhojas(cuaderno2);
    }
}
