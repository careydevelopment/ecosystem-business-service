package us.careydevelopment.ecosystem.business.service;

import io.micrometer.core.instrument.config.validate.Validated;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import us.careydevelopment.ecosystem.business.controller.BusinessController;
import us.careydevelopment.ecosystem.business.exception.InvalidRequestException;
import us.careydevelopment.ecosystem.business.model.Business;
import us.careydevelopment.ecosystem.business.repository.BusinessRepository;
import us.careydevelopment.util.api.model.ValidationError;
import us.careydevelopment.util.api.validation.ValidationUtil;

import java.util.List;

@Service
public class BusinessService {

    private static final Logger LOG = LoggerFactory.getLogger(BusinessService.class);

    @Autowired
    private BusinessRepository businessRepository;

    @Autowired
    private BusinessValidationService validationService;

    public Business save(final Business business, final BindingResult bindingResult) throws InvalidRequestException {
        validationService.validate(business, bindingResult);

        final Business returnedBusinenss = businessRepository.save(business);
        return returnedBusinenss;
    }
}
