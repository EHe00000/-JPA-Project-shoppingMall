package com.slacker.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Member")
@Table(name = "Member")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Member
{
    @Id @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_pw")
    private String member_pw;

    @Column(name = "member_age")
    private int memberAge;
}
