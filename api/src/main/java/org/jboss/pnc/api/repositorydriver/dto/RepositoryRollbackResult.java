package org.jboss.pnc.api.repositorydriver.dto;

import org.jboss.pnc.api.enums.ResultStatus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Jacksonized
@lombok.Builder(builderClassName = "Builder")
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepositoryRollbackResult {

    private String buildContentId;
    private ResultStatus status;

}
