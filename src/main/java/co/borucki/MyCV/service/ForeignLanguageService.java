package co.borucki.MyCV.service;

import co.borucki.MyCV.dto.ForeignLanguageDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ForeignLanguageService {
    List<ForeignLanguageDTO> findAll();

    ForeignLanguageDTO create(ForeignLanguageDTO foreignLanguageDTO);
}
