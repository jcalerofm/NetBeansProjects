
package ficherofacturacliente;

import java.io.*;

public class Cliente implements Serializable {

  private String nombre;
  private String direccion;
  private int numCliente;
  private int saldo;
  private String cuenta;

  public Cliente(String n, String d, int num, int s, String c) {
    nombre = n;
    direccion = d;
    numCliente = num;
    saldo = s;
    cuenta = c;
  }

  public void setNombre(String n) {
    nombre = n;
  }

  public String getNombre() {
    return nombre;
  }

  public void setDireccion(String n) {
    direccion = n;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setNumCliente(int n) {
    numCliente = n;
  }

  public int getNumCliente() {
    return numCliente;
  }

  public void setSaldo(int n) {
    saldo = n;
  }

  public int getSaldo() {
    return saldo;
  }

  public void setCuenta(String n) {
    cuenta = n;
  }

  public String getCuenta() {
    return cuenta;
  }

  public void crearCliente() {

    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Nombre: ");
      nombre = br.readLine();
      System.out.print("Dirección: ");
      direccion = br.readLine();
      System.out.print("Número de cliente: ");
      numCliente = Integer.parseInt(br.readLine());
      System.out.print("Saldo: ");
      saldo = Integer.parseInt(br.readLine());
      System.out.print("Cuenta: ");
      cuenta = br.readLine();
    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }

  public void guardarCliente() {
    try {
      FileOutputStream fos = new FileOutputStream("cliente.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(this);
      oos.close();
      fos.close();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }

  }

  public void leerCliente() {
    try {
      FileInputStream fis = new FileInputStream("cliente.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);
      Cliente cliente = (Cliente) ois.readObject();
      ois.close();
      fis.close();
      System.out.println("Nombre: " + cliente.getNombre());
      System.out.println("Direccion: " + cliente.getDireccion());
      System.out.println("Numero de cliente: " + cliente.getNumCliente());
      System.out.println("Saldo: " + cliente.getSaldo());
      System.out.println("Cuenta: " + cliente.getCuenta());
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException c) {
      System.out.println("No se encuentra la clase");
      c.printStackTrace();
    }
  }
}
