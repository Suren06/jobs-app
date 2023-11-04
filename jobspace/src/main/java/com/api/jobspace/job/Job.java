package com.api.jobspace.job;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Table
public class Job {

    @Id
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "minSalary")
    private String minSalary;

    @Column(name = "maxSalary")
    private String maxSalary;

    @Column(name = "salary")
    private String salary;

    @Column(name = "location")
    private String location;
}
