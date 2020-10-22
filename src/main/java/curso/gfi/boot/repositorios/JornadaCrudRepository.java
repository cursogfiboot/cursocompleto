package curso.gfi.boot.repositorios;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import curso.gfi.boot.entidades.Estado;
import curso.gfi.boot.entidades.Jornada;
import curso.gfi.boot.entidades.UsuarioEstado;

@Repository
public interface JornadaCrudRepository extends CrudRepository<Jornada, Integer> {


	
}
