
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iury
 */
public class Servidor extends UnicastRemoteObject implements ICalculadoraRMI {

    private static final long serialVersionUID = 1L;
    
    @Override
    public double somar(double num1, double num2) throws RemoteException {
        System.out.println("Cliente solicita: 'SOMAR'");
        return num1 + num2;
    }

    @Override
    public double subtrair(double num1, double num2) throws RemoteException {
        System.out.println("Cliente solicita: 'SUBTRAIR'");
        return num1 - num2;
    }

    @Override
    public double multiplicar(double num1, double num2) throws RemoteException {
        System.out.println("Cliente solicita: 'MULTIPLICAR'");
        return num1 * num2;
    }

    @Override
    public double dividir(double num1, double num2) throws RemoteException {
        System.out.println("Cliente solicita: 'DIVIDIR'");
        return num1/num2;
    }

    protected Servidor() throws RemoteException {
        super();
    }

    public static void main(String[] args) {
        try {
            Naming.rebind("//localhost/CalculadoraOnline", new Servidor());
            System.out.println("Servidor pronto.");
        } catch (Exception ex) {
            System.out.println("Erro: " + ex);
        }
    }

    
}
