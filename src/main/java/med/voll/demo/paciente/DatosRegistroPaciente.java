package med.voll.demo.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.demo.direccion.DatosDireccion;

public record DatosRegistroPaciente(
		@NotBlank String nombre,
		@NotBlank @Email String email ,
		@NotBlank String telefono,
		@NotBlank @Pattern(regexp="\\d{4,6}") String documentoIdentidad,
		@NotNull @Valid DatosDireccion direccion
		) {

}
