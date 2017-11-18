package co.borucki.MyCV.repository;

import co.borucki.MyCV.model.Additional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdditionalRepository extends CrudRepository<Additional, Long> {
    List<Additional> findAll();

    Additional save(Additional additional);

}
