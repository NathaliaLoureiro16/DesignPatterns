package visitor;

public abstract class Conta implements Atualizavel {

	 private double saldo;

	 public Conta(double saldo) {
	  this.saldo = saldo;
	 }

	 public double getSaldo() {
	  return saldo;
	 }

	 public void setSaldo(double saldo) {
	  this.saldo = saldo;
	 }


}
