package co.borucki.MyCV.service;

import co.borucki.MyCV.dto.ExperiencePeriodDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExperiencePeriodService {
    List<ExperiencePeriodDTO> findAll();

    ExperiencePeriodDTO create(ExperiencePeriodDTO experiencePeriodDTO);
}
