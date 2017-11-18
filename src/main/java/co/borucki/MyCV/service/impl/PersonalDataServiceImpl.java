package co.borucki.MyCV.service.impl;

import co.borucki.MyCV.dto.PersonalDataDTO;
import co.borucki.MyCV.mapper.PersonalDataMapper;
import co.borucki.MyCV.repository.PersonalDataRepository;
import co.borucki.MyCV.service.PersonalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalDataServiceImpl implements PersonalDataService {
    @Autowired
    private PersonalDataRepository personalDataRepository;

    @Autowired
    private PersonalDataMapper personalDataMapper;

    @Override
    public List<PersonalDataDTO> findAll() {
        return personalDataMapper.toPersonalDataDTOList(personalDataRepository.findAll());
    }

    @Override
    public PersonalDataDTO create(PersonalDataDTO personalDataDTO) {
        return personalDataMapper.toPersonalDataDTO(
                personalDataRepository.save(
                        personalDataMapper.toPersonalData(personalDataDTO)
                )
        );
    }
}
