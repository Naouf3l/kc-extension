package org.nel.ab.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
@Table(name = "Device")
public class Device {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "MODEL", nullable = false)
    private String model;

    @Column(name = "BRAND", nullable = false)
    private String brand;

    @Column(name = "STATUS", nullable = false)
    private String status;
}
