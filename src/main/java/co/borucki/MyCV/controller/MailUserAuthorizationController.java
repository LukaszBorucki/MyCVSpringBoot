package co.borucki.MyCV.controller;

import co.borucki.MyCV.dto.MailUserAuthorizationDTO;
import co.borucki.MyCV.service.MailUserAuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/mailAuthorization")
public class MailUserAuthorizationController {
    @Autowired
    private MailUserAuthorizationService service;

    @RequestMapping(value = "getData", method = RequestMethod.GET)
    MailUserAuthorizationDTO getData() {
        return service.getData();
    }
}
