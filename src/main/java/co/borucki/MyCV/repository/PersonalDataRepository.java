package co.borucki.MyCV.repository;

import co.borucki.MyCV.model.PersonalData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonalDataRepository extends CrudRepository<PersonalData, Long> {
    List<PersonalData> findAll();

    PersonalData save(PersonalData personalData);

}
