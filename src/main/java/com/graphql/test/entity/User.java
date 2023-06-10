package com.graphql.test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="identifier")
    private Long id;
    
    @Column(name="name", length = 40, nullable = false)
    private String name;
    
    @Column(name="nick_name", length = 40, nullable = false)
    private String nickName;
    
    @Column(name="email", length = 50, unique = true, nullable = false)
    private String email;
}         