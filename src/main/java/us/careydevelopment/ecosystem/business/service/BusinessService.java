package us.careydevelopment.ecosystem.business.service;

import io.micrometer.core.instrument.config.validate.Validated;
import org.springframework.stereotype.Service;
import us.careydevelopment.ecosystem.business.exception.InvalidRequestException;
import us.careydevelopment.ecosystem.business.model.Business;
import us.careydevelopment.util.api.model.ValidationError;

import java.util.List;

@Service
public class BusinessService {

    public void validate(Business business, List<ValidationError> validationErrors) throws InvalidRequestException {

    }
}
