package us.careydevelopment.ecosystem.business.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import us.careydevelopment.model.business.BaseBusiness;

@Document(collection = "#{@environment.getProperty('mongo.business.collection')}")
public class Business extends BaseBusiness {

    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
