package org.jboss.pnc.api.repositorydriver.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Jacksonized
@lombok.Builder(builderClassName = "Builder")
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepositoryRollbackRequest {

    private String buildContentId;

}
