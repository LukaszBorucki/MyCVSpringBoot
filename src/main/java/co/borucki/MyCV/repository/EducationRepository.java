package co.borucki.MyCV.repository;

import co.borucki.MyCV.BasicData;
import co.borucki.MyCV.model.Education;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EducationRepository {
    private List<Education> educationList = new ArrayList<>();

    public EducationRepository() {
        educationList.addAll(BasicData.BasicEducationData());
    }

    public List<Education> findAll() {
        return educationList;
    }

    public Education save(Education education) {
        educationList.add(education);
        return education;
    }


}
