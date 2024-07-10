package com.cod.market.answer.entity;

import com.cod.market.member.entity.Member;
import com.cod.market.question.entity.Question;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Answer {
    private String comment;
    private Member member;
    private Question question;
}
