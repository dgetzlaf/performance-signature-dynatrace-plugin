/*
 * Dynatrace Environment API
 * Documentation of the Dynatrace REST API. Refer to the [help page](https://www.dynatrace.com/support/help/shortlink/section-api) to read about use-cases and examples.
 *
 * OpenAPI spec version: 1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.tsystems.mms.apm.performancesignature.dynatracesaas.rest.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import static de.tsystems.mms.apm.performancesignature.ui.util.PerfSigUIUtils.toIndentedString;

/**
 * A synthetic test result.
 */
@ApiModel(description = "A synthetic test result.")

public class ExternalSyntheticTestResult {
    @SerializedName("id")
    private String id;

    @SerializedName("totalStepCount")
    private Integer totalStepCount;

    @SerializedName("locationResults")
    private List<ExternalSyntheticLocationTestResult> locationResults = new ArrayList<>();

    @SerializedName("scheduleIntervalInSeconds")
    private Integer scheduleIntervalInSeconds;

    public ExternalSyntheticTestResult id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique id which identifies the test.
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "Unique id which identifies the test.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExternalSyntheticTestResult totalStepCount(Integer totalStepCount) {
        this.totalStepCount = totalStepCount;
        return this;
    }

    /**
     * Number of steps.
     *
     * @return totalStepCount
     **/
    @ApiModelProperty(required = true, value = "Number of steps.")
    public Integer getTotalStepCount() {
        return totalStepCount;
    }

    public void setTotalStepCount(Integer totalStepCount) {
        this.totalStepCount = totalStepCount;
    }

    public ExternalSyntheticTestResult locationResults(List<ExternalSyntheticLocationTestResult> locationResults) {
        this.locationResults = locationResults;
        return this;
    }

    public ExternalSyntheticTestResult addLocationResultsItem(ExternalSyntheticLocationTestResult locationResultsItem) {
        this.locationResults.add(locationResultsItem);
        return this;
    }

    /**
     * One or more test results per location.
     *
     * @return locationResults
     **/
    @ApiModelProperty(required = true, value = "One or more test results per location.")
    public List<ExternalSyntheticLocationTestResult> getLocationResults() {
        return locationResults;
    }

    public void setLocationResults(List<ExternalSyntheticLocationTestResult> locationResults) {
        this.locationResults = locationResults;
    }

    public ExternalSyntheticTestResult scheduleIntervalInSeconds(Integer scheduleIntervalInSeconds) {
        this.scheduleIntervalInSeconds = scheduleIntervalInSeconds;
        return this;
    }

    /**
     * Schedule interval (s).
     *
     * @return scheduleIntervalInSeconds
     **/
    @ApiModelProperty(value = "Schedule interval (s).")
    public Integer getScheduleIntervalInSeconds() {
        return scheduleIntervalInSeconds;
    }

    public void setScheduleIntervalInSeconds(Integer scheduleIntervalInSeconds) {
        this.scheduleIntervalInSeconds = scheduleIntervalInSeconds;
    }

    @Override
    public String toString() {
        return "class ExternalSyntheticTestResult {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    totalStepCount: " + toIndentedString(totalStepCount) + "\n" +
                "    locationResults: " + toIndentedString(locationResults) + "\n" +
                "    scheduleIntervalInSeconds: " + toIndentedString(scheduleIntervalInSeconds) + "\n" +
                "}";
    }
}

