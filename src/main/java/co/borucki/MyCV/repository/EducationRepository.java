package co.borucki.MyCV.repository;

import co.borucki.MyCV.model.Education;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepository extends CrudRepository<Education, Long> {
    List<Education> findAll();

    Education save(Education education);

}
