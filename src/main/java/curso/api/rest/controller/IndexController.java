package curso.api.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import curso.api.rest.model.Usuario;

@RestController
@RequestMapping(value = "usuario")
public class IndexController {
	
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<Usuario> init() {
	
		Usuario usuario = new Usuario();
		usuario.setId(10L);
		usuario.setLogin("jjs2");
		usuario.setNome("Jailson");
		usuario.setSenha("123");

	
	return ResponseEntity.ok(usuario);

	}

}