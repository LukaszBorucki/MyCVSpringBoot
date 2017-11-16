package co.borucki.MyCV.service.impl;

import co.borucki.MyCV.dto.EducationDTO;
import co.borucki.MyCV.mapper.EducationMapper;
import co.borucki.MyCV.repository.EducationRepository;
import co.borucki.MyCV.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService {
    @Autowired
    private EducationRepository educationRepository = new EducationRepository();

    @Autowired
    private EducationMapper educationMapper;

    @Override
    public List<EducationDTO> findAll() {
        return educationMapper.toEducationDTOList(educationRepository.findAll());
    }

    @Override
    public EducationDTO create(EducationDTO educationDTO) {
        return educationMapper.toEducationDTO(
                educationRepository.save(
                        educationMapper.toEducation(educationDTO)
                )
        );
    }
}
