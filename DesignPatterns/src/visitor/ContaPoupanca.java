package visitor;

public class ContaPoupanca extends Conta{

	 private double saldo;
	 

	 public ContaPoupanca(double saldo) {
	  super(saldo);
	  this.saldo = saldo;
	 }


	 public void setSaldo(double saldo) {
	  this.saldo = saldo;
	 }

	 
	 public double getSaldo() {
	  
	  return saldo;
	 }


	 @Override
	 public void atualiza(AtualizadorDeConta atualizadorDeConta) {
	  atualizadorDeConta.atualiza(this);
	  
	 }

}
