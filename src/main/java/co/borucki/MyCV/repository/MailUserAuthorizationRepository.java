package co.borucki.MyCV.repository;

import co.borucki.MyCV.BasicData;
import co.borucki.MyCV.model.MailUserAuthorization;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailUserAuthorizationRepository {
    private MailUserAuthorization mailUserAuthorization = BasicData.BasicMailUserAuthorizationData();

    public MailUserAuthorizationRepository() {
    }

    public MailUserAuthorization getData() {
        return mailUserAuthorization;
    }
}
