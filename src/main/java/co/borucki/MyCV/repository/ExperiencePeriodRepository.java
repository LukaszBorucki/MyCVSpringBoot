package co.borucki.MyCV.repository;

import co.borucki.MyCV.model.ExperiencePeriod;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExperiencePeriodRepository extends CrudRepository<ExperiencePeriod, Long> {
    List<ExperiencePeriod> findAll();

    ExperiencePeriod save(ExperiencePeriod experiencePeriod) ;
}
