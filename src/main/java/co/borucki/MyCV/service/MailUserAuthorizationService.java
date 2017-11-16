package co.borucki.MyCV.service;

import co.borucki.MyCV.dto.MailUserAuthorizationDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MailUserAuthorizationService {
    MailUserAuthorizationDTO getData();

}
