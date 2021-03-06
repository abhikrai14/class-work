import java.rmi.*;
import java.rmi.server.*;

class CounterImpl extends UnicastRemoteObject implements Counter{

	public int value=0;
	public CounterImpl(int v) throws RemoteException {
		this.value=v;
	}
	public void increment() throws RemoteException {
		this.value++;
	}
	public void decrement() throws RemoteException {
		this.value--;
	}
	public int read_value() throws RemoteException {
		return this.value;
	}
	
	public void reset() throws RemoteException {
		 this.value=0;
	}
}
