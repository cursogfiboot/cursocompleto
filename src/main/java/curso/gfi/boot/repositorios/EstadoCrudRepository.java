package curso.gfi.boot.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import curso.gfi.boot.entidades.Estado;

@Repository
public interface EstadoCrudRepository extends CrudRepository<Estado, Integer> {


	
}
