package principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import principal.entidades.Solicitud;

public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {

}
