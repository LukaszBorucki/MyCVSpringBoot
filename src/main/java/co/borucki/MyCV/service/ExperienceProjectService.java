package co.borucki.MyCV.service;

import co.borucki.MyCV.dto.ExperienceProjectDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExperienceProjectService {
    List<ExperienceProjectDTO> findAll();

    ExperienceProjectDTO create(ExperienceProjectDTO experienceProjectDTO);
}
