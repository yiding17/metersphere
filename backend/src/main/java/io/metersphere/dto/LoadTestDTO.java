package io.metersphere.dto;

import io.metersphere.base.domain.LoadTest;

public class LoadTestDTO extends LoadTest {
    private String projectName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}