package co.borucki.MyCV.service.impl;

import co.borucki.MyCV.dto.ForeignLanguageDTO;
import co.borucki.MyCV.mapper.ForeignLanguageMapper;
import co.borucki.MyCV.repository.ForeignLanguageRepository;
import co.borucki.MyCV.service.ForeignLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForeignLanguageServiceImpl implements ForeignLanguageService{
    @Autowired
    private ForeignLanguageRepository foreignLanguageRepository;

    @Autowired
    private ForeignLanguageMapper foreignLanguageMapper;

    @Override
    public List<ForeignLanguageDTO> findAll() {
        return foreignLanguageMapper.toForeignLanguageDTOList(foreignLanguageRepository.findAll());
    }

    @Override
    public ForeignLanguageDTO create(ForeignLanguageDTO foreignLanguageDTO) {
        return foreignLanguageMapper.toForeignLanguageDTO(
                foreignLanguageRepository.save(
                        foreignLanguageMapper.toForeignLanguage(foreignLanguageDTO)
                )
        );
    }
}
