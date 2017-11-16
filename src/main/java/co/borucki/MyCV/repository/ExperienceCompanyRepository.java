package co.borucki.MyCV.repository;

import co.borucki.MyCV.BasicData;
import co.borucki.MyCV.model.ExperienceCompany;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ExperienceCompanyRepository {
    private List<ExperienceCompany> experienceCompanyList = new ArrayList<>();

    public ExperienceCompanyRepository() {
        experienceCompanyList.addAll(BasicData.BasicExperienceCompanyData());
    }

    public List<ExperienceCompany> findAll() {
        return experienceCompanyList;
    }

    public ExperienceCompany save(ExperienceCompany experienceCompany) {
        experienceCompanyList.add(experienceCompany);
        return experienceCompany;
    }
}
