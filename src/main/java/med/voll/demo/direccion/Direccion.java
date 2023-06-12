package med.voll.demo.direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter

@AllArgsConstructor
public class Direccion {
	public Direccion() {
		
	}
	private String calle;
	private String numero;
	private String complemento;
	private String distrito;
	private String ciudad;
	public Direccion(DatosDireccion direccion) {
		// TODO Auto-generated constructor stub
		this.calle = direccion.calle();
		this.numero = direccion.numero();
		this.distrito = direccion.distrito();
		this.complemento = direccion.complemento();
		this.ciudad = direccion.ciudad();
	}
	public Direccion actualizarDatos(DatosDireccion direccion) {
		this.calle = direccion.calle();
		this.numero = direccion.numero();
		this.distrito = direccion.distrito();
		this.complemento = direccion.complemento();
		this.ciudad = direccion.ciudad();
		
		return this;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
}

