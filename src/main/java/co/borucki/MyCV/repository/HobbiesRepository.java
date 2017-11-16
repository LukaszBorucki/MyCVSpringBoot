package co.borucki.MyCV.repository;

import co.borucki.MyCV.BasicData;
import co.borucki.MyCV.model.Hobbies;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HobbiesRepository {
    private List<Hobbies> hobbiesList = new ArrayList<>();

    public HobbiesRepository() {
    hobbiesList.addAll(BasicData.BasicHobbesData());
    }

    public List<Hobbies> findAll() {
        return hobbiesList;
    }

    public Hobbies save(Hobbies hobbies) {
        hobbiesList.add(hobbies);
        return hobbies;
    }
}
