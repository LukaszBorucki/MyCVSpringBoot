package co.borucki.MyCV.repository;

import co.borucki.MyCV.BasicData;
import co.borucki.MyCV.model.ExperiencePeriod;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ExperiencePeriodRepository {
    private List<ExperiencePeriod> experiencePeriodList = new ArrayList<>();

    public ExperiencePeriodRepository() {
        experiencePeriodList.addAll(BasicData.BasicExperiencePeriodData());
    }

    public List<ExperiencePeriod> findAll() {
        return experiencePeriodList;
    }

    public ExperiencePeriod save(ExperiencePeriod experiencePeriod) {
    experiencePeriodList.add(experiencePeriod);
    return experiencePeriod;
    }
}
