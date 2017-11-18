package co.borucki.MyCV.repository;

import co.borucki.MyCV.model.ExperienceCompany;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExperienceCompanyRepository extends CrudRepository<ExperienceCompany, Long> {
    List<ExperienceCompany> findAll();

    ExperienceCompany save(ExperienceCompany experienceCompany);
}
