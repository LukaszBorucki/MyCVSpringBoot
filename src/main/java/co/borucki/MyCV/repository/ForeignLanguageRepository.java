package co.borucki.MyCV.repository;

import co.borucki.MyCV.BasicData;
import co.borucki.MyCV.model.ForeignLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ForeignLanguageRepository {
    private List<ForeignLanguage> foreignLanguageList = new ArrayList<>();

    public ForeignLanguageRepository() {
        foreignLanguageList.addAll(BasicData.BasicForeignLanguageData());
    }

    public List<ForeignLanguage> findAll() {
        return foreignLanguageList;
    }

    public ForeignLanguage save(ForeignLanguage foreignLanguage) {
        foreignLanguageList.add(foreignLanguage);
        return foreignLanguage;
    }
}
