package us.careydevelopment.ecosystem.business.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import us.careydevelopment.ecosystem.business.exception.InvalidRequestException;
import us.careydevelopment.ecosystem.business.model.Business;
import us.careydevelopment.ecosystem.business.repository.BusinessRepository;
import us.careydevelopment.util.api.model.IRestResponse;
import us.careydevelopment.util.api.model.ValidationError;
import us.careydevelopment.util.api.response.ResponseEntityUtil;
import us.careydevelopment.util.api.validation.ValidationUtil;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;


@RestController
public class BusinessController {
	
    private static final Logger LOG = LoggerFactory.getLogger(BusinessController.class);

    @Autowired
    private BusinessRepository businessRepository;

    @PostMapping("/businesses")
    public ResponseEntity<IRestResponse<Business>> createBusiness(final HttpServletRequest request,
                                                                  @Valid @RequestBody final Business business,
                                                                  BindingResult bindingResult)
                                                                    throws InvalidRequestException {
        LOG.debug("Adding business: " + business);

        List<ValidationError> validationErrors = ValidationUtil.convertBindingResultToValidationErrors(bindingResult);
        LOG.error("Validation errors: " + validationErrors);
        if (validationErrors.size() > 0) {
            throw new InvalidRequestException("Validation errors!", validationErrors);
        }

        final Business returnedBusiness = businessRepository.save(business);

        return ResponseEntityUtil.createSuccessfulResponseEntity("Successfully created!",
                HttpStatus.CREATED.value(),
                returnedBusiness);
    }
}
