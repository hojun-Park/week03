package com.example.inhastudy1.inhastudy1.domain;

import com.example.inhastudy1.inhastudy1.domain.SignUp;
import com.example.inhastudy1.inhastudy1.models.SignUpRequestDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SignUpRepository extends JpaRepository<SignUp, String>{
    SignUp findSignUpById(String id);
}
