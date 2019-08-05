package com.cogent.modal;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Student")
@NoArgsConstructor
@Getter
@Setter
@ApiModel
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "DepartmentQuery id i.e. auto generated by database")
    private Long id;

    private String name;

    private int age;

    private String address;

    private int grade;

    private Character gender;

    private String nationality;

    private String religion;

    private String DOB;

    private String Phone;

    private Character status;

    private String fatherName;

    private String motherName;

    private String grandFatherName;

    private String schoolName;

    private String district;

    private String zone;

    private int ward;

    private String bloodGroup;

    private String remarks;

}