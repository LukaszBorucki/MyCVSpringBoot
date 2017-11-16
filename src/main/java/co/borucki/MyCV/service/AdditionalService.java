package co.borucki.MyCV.service;

import co.borucki.MyCV.dto.AdditionalDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdditionalService {
    List<AdditionalDTO> findAll();

    AdditionalDTO create(AdditionalDTO additionalDTO);
}
