
public class PaisEuropeo {

	private static double fondo_comun;
	
	private String nombre;
	private int poblacion; 
	private String dominio;
	private double saldo_aportado;
	
	public void aportar(double importe)
	{
		fondo_comun += importe;
		saldo_aportado += importe;
	}
	
	public void retirar(double importe)
	{
		fondo_comun -= importe;
		saldo_aportado -= importe;
	}
	
	public static double getFondoComun()
	{
		return fondo_comun;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public PaisEuropeo(String nombre, int poblacion, String dominio)
	{
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.dominio = dominio;
	}
	
	public PaisEuropeo(String nombre, int poblacion)
	{
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.dominio = nombre.substring(0, 2); 
	}
	
	public char getCategoria()
	{
		char categoria;
		
		if (saldo_aportado > 10000)
			categoria = 'A';
		else if (saldo_aportado >= 0 && saldo_aportado <= 10000)
			categoria = 'B';
		else //Sólo entra aquí en el caso de que saldo_aportado < 0
			categoria = 'C';
		
		return categoria;
	}
	
