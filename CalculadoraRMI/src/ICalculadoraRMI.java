
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iury
 */
public interface ICalculadoraRMI extends Remote{
    public double somar(double num1, double num2) throws RemoteException;
    public double subtrair(double num1, double num2) throws RemoteException;
    public double multiplicar(double num1, double num2) throws RemoteException;
    public double dividir(double num1, double num2) throws RemoteException;
}
