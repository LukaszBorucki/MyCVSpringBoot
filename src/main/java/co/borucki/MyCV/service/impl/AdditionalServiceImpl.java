package co.borucki.MyCV.service.impl;

import co.borucki.MyCV.dto.AdditionalDTO;
import co.borucki.MyCV.mapper.AdditionalMapper;
import co.borucki.MyCV.repository.AdditionalRepository;
import co.borucki.MyCV.service.AdditionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdditionalServiceImpl implements AdditionalService {
    @Autowired
    private AdditionalRepository additionalRepository;

    @Autowired
    private AdditionalMapper additionalMapper;

    @Override
    public List<AdditionalDTO> findAll() {
        return additionalMapper.toAdditionalDTOList(additionalRepository.findAll());
    }

    @Override
    public AdditionalDTO create(AdditionalDTO additionalDTO) {
        return additionalMapper.toAdditionalDTO(
                additionalRepository.save(
                        additionalMapper.toAdditional(additionalDTO)
                )
        );
    }
}
