import java.util.Scanner;

public class Cuaderno {
    private String marca;
    private double precio;
    private int nroHojas;
    private String tamaño;

    public Cuaderno() {
        this.marca = "";
        this.precio = 0.0;
        this.nroHojas = 0;
        this.tamaño = "";
    }

    public Cuaderno(String marca, double precio, int nroHojas, String tamaño) {
        this.marca = marca;
        this.precio = precio;
        this.nroHojas = nroHojas;
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNroHojas() {
        return nroHojas;
    }

    public void setNroHojas(int nroHojas) {
        this.nroHojas = nroHojas;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void leer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la marca del cuaderno: ");
        this.marca = scanner.nextLine();

        System.out.print("Ingrese el precio del cuaderno: ");
        this.precio = scanner.nextDouble();

        System.out.print("Ingrese el número de hojas: ");
        this.nroHojas = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese el tamaño del cuaderno: ");
        this.tamaño = scanner.nextLine();
    }

    public void mostrar(){
        System.out.println("Marca"+marca);
        System.out.println("Precio: "+marca);
        System.out.println("NroHojas: "+marca);
        System.out.println("Tamaño: "+marca);
    }
    
    public void verificarhojas(int z){
        if (nroHojas==z) {
            System.out.println("Es igual");
        }else{
            System.out.println("No es igual");
        }
    }
    public void mayorhojas(Cuaderno a){
        if (nroHojas>a.nroHojas) {
            System.out.println("Marca: "+marca);
        }else{
            System.out.println("Marca: "+a.marca);
        }
    }
}
