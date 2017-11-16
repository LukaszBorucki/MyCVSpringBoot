package co.borucki.MyCV.service;

import co.borucki.MyCV.dto.EducationDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EducationService {
    List<EducationDTO> findAll();

    EducationDTO create(EducationDTO educationDTO);
}
