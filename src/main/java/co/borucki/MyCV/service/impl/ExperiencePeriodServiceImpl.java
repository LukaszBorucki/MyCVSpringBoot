package co.borucki.MyCV.service.impl;

import co.borucki.MyCV.dto.ExperiencePeriodDTO;
import co.borucki.MyCV.mapper.ExperiencePeriodMapper;
import co.borucki.MyCV.repository.ExperiencePeriodRepository;
import co.borucki.MyCV.service.ExperiencePeriodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperiencePeriodServiceImpl implements ExperiencePeriodService {
    @Autowired
    private ExperiencePeriodRepository experiencePeriodRepository;

    @Autowired
    private ExperiencePeriodMapper experiencePeriodMapper;

    @Override
    public List<ExperiencePeriodDTO> findAll() {
        return experiencePeriodMapper.toExperiencePeriodDTOList(experiencePeriodRepository.findAll());
    }

    @Override
    public ExperiencePeriodDTO create(ExperiencePeriodDTO experiencePeriodDTO) {
        return experiencePeriodMapper.toExperiencePeriodDTO(
                experiencePeriodRepository.save(
                        experiencePeriodMapper.toExperiencePeriod(experiencePeriodDTO)
                )
        );
    }
}
