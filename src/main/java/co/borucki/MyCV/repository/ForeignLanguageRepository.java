package co.borucki.MyCV.repository;

import co.borucki.MyCV.model.ForeignLanguage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ForeignLanguageRepository extends CrudRepository<ForeignLanguage, Long> {
    List<ForeignLanguage> findAll();

    ForeignLanguage save(ForeignLanguage foreignLanguage);
}
