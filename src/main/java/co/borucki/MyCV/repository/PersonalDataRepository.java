package co.borucki.MyCV.repository;

import co.borucki.MyCV.BasicData;
import co.borucki.MyCV.model.PersonalData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonalDataRepository {
    private List<PersonalData> personalDataList = new ArrayList<>();

    public PersonalDataRepository() {
        personalDataList.addAll(BasicData.BasicPersonalDataData());
    }

    public List<PersonalData> findAll() {
        return personalDataList;
    }

    public PersonalData save(PersonalData personalData) {
        personalDataList.add(personalData);
        return personalData;
    }
}
