package med.voll.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.voll.demo.infra.security.DatosJWTtoken;
import med.voll.demo.infra.security.TokenService;
import med.voll.demo.user.DatosAutenticacionUsuarios;
import med.voll.demo.user.Usuario;

@RestController
@RequestMapping("/login")
public class AutenticacionController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private TokenService tokenserivce;
	@PostMapping
	public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuarios datosAutenticacionUsuario) {
        Authentication authToken = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.login(),
                datosAutenticacionUsuario.clave());
        var usuarioAutenticado = authenticationManager.authenticate(authToken);
        var JWTtoken = tokenserivce.generarToken((Usuario) usuarioAutenticado.getPrincipal());
        return ResponseEntity.ok(new DatosJWTtoken(JWTtoken));
    }
}
