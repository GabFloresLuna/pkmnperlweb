package cl.poketienda.ms_ventas.repository;

import cl.poketienda.ms_ventas.model.Boleta;
import cl.poketienda.ms_ventas.model.EstadoBoleta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoletaRepository extends JpaRepository<Boleta, Long> {

    // Todas las boletas, de la más reciente a la más antigua
    List<Boleta> findAllByOrderByFechaDesc();

    // Historial de compras de un usuario
    List<Boleta> findByUsuarioIdOrderByFechaDesc(Long usuarioId);

    // Boletas que no están en un estado dado (para reportes: todas menos ANULADA)
    List<Boleta> findByEstadoNot(EstadoBoleta estado);
}