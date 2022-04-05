package us.careydevelopment.ecosystem.business.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import us.careydevelopment.ecosystem.business.model.Business;
import us.careydevelopment.ecosystem.business.model.Industry;
import us.careydevelopment.ecosystem.business.repository.BusinessRepository;
import us.careydevelopment.ecosystem.business.repository.IndustryRepository;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
public class BusinessController {
	
    private static final Logger LOG = LoggerFactory.getLogger(BusinessController.class);

    @Autowired
    private BusinessRepository businessRepository;

    @PostMapping("/businesses")
    public Business addBusiness(HttpServletRequest request, @RequestBody Business business) {
        LOG.debug("Adding business: " + business);
        Business returnedBusiness = businessRepository.save(business);
        return returnedBusiness;
    }
}
