package principal.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import principal.entidades.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

}
