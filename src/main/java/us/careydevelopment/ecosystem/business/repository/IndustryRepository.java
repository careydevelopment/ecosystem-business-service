package us.careydevelopment.ecosystem.business.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import us.careydevelopment.ecosystem.business.model.Industry;

public interface IndustryRepository extends MongoRepository<Industry, String> {

	Industry findByNaics();
}
