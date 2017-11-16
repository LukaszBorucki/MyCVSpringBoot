package co.borucki.MyCV.controller;

import co.borucki.MyCV.dto.AdditionalDTO;
import co.borucki.MyCV.service.AdditionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/additional")
public class AdditionalController {
    @Autowired
    private AdditionalService additionalService;

    @RequestMapping(value = "/all", method = GET)
    public List<AdditionalDTO> findAll() {
        return additionalService.findAll();
    }

    @RequestMapping(value = "/create", method = POST)
    public AdditionalDTO create(@RequestBody AdditionalDTO additionalDTO) {
        return additionalService.create(additionalDTO);
    }
}
