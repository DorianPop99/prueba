package deposito;

public class CuentaBanco {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    private int nCuenta;

    public CuentaBanco()
    {
    }

    public CuentaBanco(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }
    public int registroCuentas(int cuentas){
    	cuentas=10;
    	for(int i=0;i<cuentas;i++){
    		setnCuenta(i++);
    	}
		return getnCuenta();
    	
    }
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

	private int getnCuenta() {
		return nCuenta;
	}

	private void setnCuenta(int nCuenta) {
		this.nCuenta = nCuenta;
	}
}
