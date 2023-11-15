package TDB.MsSeguridad.controller;

import java.util.List;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TDB.MsSeguridad.services.AuthService;

import TDB.MsSeguridad.model.UsuarioModel;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @GetMapping
    public List<UsuarioModel> getAll() {
        return authService.getAll();
    }
     @PostMapping("/registro")
    public UsuarioModel registrarUsuario(@RequestBody @Validated UsuarioModel usuario) {
        return authService.Create(usuario);
    }
    @PutMapping("/actualizar")
    public UsuarioModel actualizarUsuario(@RequestBody @Validated UsuarioModel usuario) {
        return authService.Update(usuario);
    }
 
}
