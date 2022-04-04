package us.careydevelopment.ecosystem.business.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "#{@environment.getProperty('mongo.industry.collection')}")
public class Industry {

    @Id
    private String id;

    //naics codes come from https://assess.connectiveleadership.com/instruments/lookup_naics.asp?task=lookUp
    private Integer naics;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNaics() {
        return naics;
    }

    public void setNaics(Integer naics) {
        this.naics = naics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
