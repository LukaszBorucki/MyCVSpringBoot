package co.borucki.MyCV.service;

import co.borucki.MyCV.dto.ExperienceCompanyDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExperienceCompanyService {
    List<ExperienceCompanyDTO> findAll();

    ExperienceCompanyDTO create(ExperienceCompanyDTO experienceCompanyDTO);
}
