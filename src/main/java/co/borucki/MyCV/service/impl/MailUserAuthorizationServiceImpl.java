package co.borucki.MyCV.service.impl;

import co.borucki.MyCV.dto.MailUserAuthorizationDTO;
import co.borucki.MyCV.mapper.MailUserAuthorizationMapper;
import co.borucki.MyCV.repository.MailUserAuthorizationRepository;
import co.borucki.MyCV.service.MailUserAuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailUserAuthorizationServiceImpl implements MailUserAuthorizationService {
    @Autowired
    private MailUserAuthorizationRepository mailUserAuthorizarionRepository = new MailUserAuthorizationRepository();

    @Autowired
    private MailUserAuthorizationMapper mailUserAuthorizarionMapper;

    @Override
    public MailUserAuthorizationDTO getData() {
        return mailUserAuthorizarionMapper.toMailUserAuthorizationDTO(mailUserAuthorizarionRepository.getData());
    }
}
