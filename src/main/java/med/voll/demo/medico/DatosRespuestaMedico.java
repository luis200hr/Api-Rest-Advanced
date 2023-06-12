package med.voll.demo.medico;

import med.voll.demo.direccion.DatosDireccion;

public record DatosRespuestaMedico(
		Long id,
		String nombre,
		String email,
		String telefono,
		String documento,
		DatosDireccion direccion
		) {

}
