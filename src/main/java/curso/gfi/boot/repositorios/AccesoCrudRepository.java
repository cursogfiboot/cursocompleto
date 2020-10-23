package curso.gfi.boot.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import curso.gfi.boot.entidades.Acceso;
import curso.gfi.boot.entidades.Empleado;

@Repository
public interface AccesoCrudRepository extends CrudRepository<Acceso, Integer> {


	
}
