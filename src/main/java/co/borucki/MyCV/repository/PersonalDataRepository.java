package co.borucki.MyCV.repository;

import co.borucki.MyCV.BasicData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonalDataRepository {
    private List<PersonalDataRepository> personalDataRepositoryList = new ArrayList<>();

    public PersonalDataRepository() {
        personalDataRepositoryList.addAll(BasicData.BasicPersonalDataRepositoryData());
    }

    public List<PersonalDataRepository> findAll() {
        return personalDataRepositoryList;
    }

    public PersonalDataRepository save(PersonalDataRepository personalDataRepository) {
        personalDataRepositoryList.add(personalDataRepository);
        return personalDataRepository;
    }
}
