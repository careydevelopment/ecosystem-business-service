package us.careydevelopment.ecosystem.business.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BusinessController {
	
    private static final Logger LOG = LoggerFactory.getLogger(BusinessController.class);

//    @GetMapping("/states")
//    public List<State> fetchAllStates(HttpServletRequest request) {
//        LOG.debug("Fetching all states");
//        LOG.debug("Remote IP is " + request.getRemoteAddr());
//        return stateRepository.findByOrderByNameAsc();
//    }
//
//
//    @GetMapping("/countries")
//    public List<Country> fetchAllCountries() {
//        LOG.debug("Fetching all countries");
//        return countryRepository.findByOrderByNameAsc();
//    }
//
//    @GetMapping("/zips")
//    public List<ZipInfo> fetchAllZips() {
//        LOG.debug("Fetching all U.S. zips");
//        return zipRepository.findAll();
//    }
//
//    @GetMapping("/timezones")
//        public List<String> fetchAllTimezones() {
//        LOG.debug("Fetching all time zones");
//
//        List<String> list = new ArrayList<String>(ZoneId.getAvailableZoneIds());
//        Collections.sort(list);
//
//        return list;
//    }
}
