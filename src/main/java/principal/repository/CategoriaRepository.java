package principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import principal.entidades.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
