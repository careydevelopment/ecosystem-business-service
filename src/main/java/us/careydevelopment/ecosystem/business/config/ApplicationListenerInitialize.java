package us.careydevelopment.ecosystem.business.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import us.careydevelopment.ecosystem.business.model.Industry;
import us.careydevelopment.ecosystem.business.repository.IndustryRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

@Component
public class ApplicationListenerInitialize implements ApplicationListener<ApplicationReadyEvent>  {

    public void onApplicationEvent(ApplicationReadyEvent event) {
    }
}