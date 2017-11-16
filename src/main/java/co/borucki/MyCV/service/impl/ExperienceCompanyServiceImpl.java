package co.borucki.MyCV.service.impl;

import co.borucki.MyCV.dto.ExperienceCompanyDTO;
import co.borucki.MyCV.mapper.ExperienceCompanyMapper;
import co.borucki.MyCV.repository.ExperienceCompanyRepository;
import co.borucki.MyCV.service.ExperienceCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceCompanyServiceImpl implements ExperienceCompanyService {
    @Autowired
    private ExperienceCompanyRepository experienceCompanyRepository = new ExperienceCompanyRepository();

    @Autowired
    private ExperienceCompanyMapper experienceCompanyMapper;

    @Override
    public List<ExperienceCompanyDTO> findAll() {
        return experienceCompanyMapper.toExperienceCompanyDTOList(experienceCompanyRepository.findAll());
    }

    @Override
    public ExperienceCompanyDTO create(ExperienceCompanyDTO experienceCompanyDTO) {
        return experienceCompanyMapper.toExperienceCompanyDTO(
                experienceCompanyRepository.save(
                        experienceCompanyMapper.toExperienceCompany(experienceCompanyDTO)
                )
        );
    }
}
