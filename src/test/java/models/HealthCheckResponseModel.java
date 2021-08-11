package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class HealthCheckResponseModel {

    Integer uptime;
    boolean readOnly;
    documents doc;


    public documents getDoc() {
        return doc;
    }

    public HealthCheckResponseModel setDoc(documents doc) {
        this.doc = doc;
        return this;
    }


    public Integer getUptime() {
        return uptime;
    }

    public HealthCheckResponseModel setUptime(Integer uptime) {
        this.uptime = uptime;
        return this;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public HealthCheckResponseModel setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }


}
