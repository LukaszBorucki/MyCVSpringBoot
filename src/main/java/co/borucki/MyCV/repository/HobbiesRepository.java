package co.borucki.MyCV.repository;

import co.borucki.MyCV.model.Hobbies;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HobbiesRepository extends CrudRepository<Hobbies, Long> {
    List<Hobbies> findAll();

    Hobbies save(Hobbies hobbies);
}
