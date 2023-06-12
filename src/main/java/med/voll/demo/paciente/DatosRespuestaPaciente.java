package med.voll.demo.paciente;

import med.voll.demo.direccion.DatosDireccion;

public record DatosRespuestaPaciente(
		Long id,
		String nombre,
		String email,
		String telefono,
		String documento,
		DatosDireccion direccion
		) {
	
}
