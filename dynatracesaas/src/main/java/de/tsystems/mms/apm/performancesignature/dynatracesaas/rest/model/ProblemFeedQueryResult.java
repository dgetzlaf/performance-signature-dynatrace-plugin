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
 * Details of open problems in your environment.
 */
@ApiModel(description = "Details of open problems in your environment.")

public class ProblemFeedQueryResult {
    @SerializedName("problems")
    private List<Problem> problems;

    @SerializedName("monitored")
    private ProblemFeedQueryResultMonitored monitored;

    public ProblemFeedQueryResult problems(List<Problem> problems) {
        this.problems = problems;
        return this;
    }

    public ProblemFeedQueryResult addProblemsItem(Problem problemsItem) {
        if (this.problems == null) {
            this.problems = new ArrayList<>();
        }
        this.problems.add(problemsItem);
        return this;
    }

    /**
     * The list of problems and their details.   All problems within specified timeframe, open and closed, are listed.
     *
     * @return problems
     **/
    @ApiModelProperty(value = "The list of problems and their details.   All problems within specified timeframe, open and closed, are listed.")
    public List<Problem> getProblems() {
        return problems;
    }

    public void setProblems(List<Problem> problems) {
        this.problems = problems;
    }

    public ProblemFeedQueryResult monitored(ProblemFeedQueryResultMonitored monitored) {
        this.monitored = monitored;
        return this;
    }

    /**
     * Get monitored
     *
     * @return monitored
     **/
    @ApiModelProperty()
    public ProblemFeedQueryResultMonitored getMonitored() {
        return monitored;
    }

    public void setMonitored(ProblemFeedQueryResultMonitored monitored) {
        this.monitored = monitored;
    }

    @Override
    public String toString() {
        return "class ProblemFeedQueryResult {\n" +
                "    problems: " + toIndentedString(problems) + "\n" +
                "    monitored: " + toIndentedString(monitored) + "\n" +
                "}";
    }
}

