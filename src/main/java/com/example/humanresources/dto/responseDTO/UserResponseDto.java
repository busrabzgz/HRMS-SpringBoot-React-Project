package com.example.humanresources.dto.responseDTO;

import com.example.humanresources.enums.DepartmentEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto  {
    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    private Long version = 0L;

    private String firstName;
    private String lastName;
    private String citizenNumber;
    private String gender;
    private Date birthOfDate;
    private String position;
    private BigDecimal salary;
    private String  level;
    private LocalDateTime startToWork;

    @Enumerated
    private DepartmentEnum department;

    private String email;
    private String phoneNumber;
    private String address;

}
