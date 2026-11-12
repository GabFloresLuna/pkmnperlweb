package cl.poketienda.ms_ventas.repository;

import cl.poketienda.ms_ventas.model.DetalleBoleta;
import cl.poketienda.ms_ventas.model.EstadoBoleta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleBoletaRepository extends JpaRepository<DetalleBoleta, Long> {

    // Detalles cuya boleta no está en un estado dado (para reportes: todos menos ANULADA)
    List<DetalleBoleta> findByBoletaEstadoNot(EstadoBoleta estado);
}