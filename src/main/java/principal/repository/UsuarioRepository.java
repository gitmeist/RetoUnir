package principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import principal.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{

}
