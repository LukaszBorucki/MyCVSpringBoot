package co.borucki.MyCV.repository;

import co.borucki.MyCV.BasicData;
import co.borucki.MyCV.model.Additional;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AdditionalRepository {
    private List<Additional> additionalList = new ArrayList<>();

    public AdditionalRepository() {
        additionalList.addAll(BasicData.BasicAdditionalData());
    }

    public List<Additional> findAll() {
        return additionalList;
    }

    public Additional save(Additional additional) {
        additionalList.add(additional);
        return additional;
    }


}
