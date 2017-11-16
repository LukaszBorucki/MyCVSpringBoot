package co.borucki.MyCV.service;

import co.borucki.MyCV.dto.PersonalDataDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonalDataService {
    List<PersonalDataDTO> findAll();

    PersonalDataDTO create(PersonalDataDTO personalDataDTO);
}
