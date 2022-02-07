package articulo;

public class Articulo {
	
	private String nombre;
	private Double precio;
	private final static Integer iva = 21;
	private int cuantosQuedan;

	public Articulo() {
	nombre="";
	precio=0.0;
	cuantosQuedan=0;
	}

	/**
	*
	* @param nombre indica el nombre del articulo...
	* @param precio
	* @param cuantosQuedan
	*/
	public Articulo(String nombre, double precio, int cuantosQuedan) {
	this();//llamo al constructor
	this.setNombre(nombre);
	this.setPrecio(precio);
	this.setCuantosQuedan(cuantosQuedan);
	}

	public void imprime() {
	System.out.println(this.toString());
	}

	public double getPVP() {
	return (this.precio * iva/100)+this.precio;
	}

	public double getPVPDescuento(double descuento) {
	return (this.getPVP() - this.getPVP()*descuento/100);
	}

	public boolean vender(int cant) {
	if (this.cuantosQuedan>=cant) {
	this.cuantosQuedan -= cant;
	return true;
	}else {
	return false;
	}
	}

	public boolean almacenar(int c) {
	if (c>=0) {
	this.cuantosQuedan +=c;
	return true;
	}else {
	return false;
	}
	}

	@Override
	public String toString() {
	return this.nombre + " - Precio: "+this.getPrecio().toString()+"€ - IVA: "+iva.toString()+"% - PVP: "
	+this.getPrecioConIva().toString()+"€";
	}
	private Double getPrecioConIva() {
	return (this.precio * iva/100)+this.precio;
	}
	public String getNombre() {
	return nombre;
	}

	private boolean hayDigito(String nombre) {
	for (int i=0;i<nombre.length();i++) {
	Character c = nombre.charAt(i);
	if (Character.isDigit(c)){
	return true;
	}
	}
	return false;
	}
	public void setNombre(String nombre) {
	//comprobamos que el primer caracter no es un dígito
	if (hayDigito(nombre)) {
	System.err.println("Nombre erroneo");
	}else {
	this.nombre = nombre;
	}

	}
	public Double getPrecio() {
	return precio;
	}
	public void setPrecio(double precio) {
	if (precio>=0) {
	this.precio = precio;
	}else {
	System.err.println("precio equivocado..");
	}

	}
	public int getCuantosQuedan() {
	return cuantosQuedan;
	}
	public void setCuantosQuedan(int cuantosQuedan) {
	if (cuantosQuedan>=0) {
	this.cuantosQuedan = cuantosQuedan;
	}else {
	System.err.println("valor erroneo..");
	}

	}

	@Override
	public boolean equals(Object obj) {
	if (obj instanceof Articulo) {
	Articulo art =(Articulo)obj;
	return art.getNombre().equalsIgnoreCase(this.nombre);
	}
	return false;
	}

	}
